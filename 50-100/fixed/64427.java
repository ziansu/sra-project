public synchronized void remIbeaconFilter(nl.dobots.bluenet.ibeacon.BleIbeaconFilter filter) {
    for (int i = (_iBeaconFilter.size()) - 1; i >= 0; i--) {
        if (_iBeaconFilter.get(i).equals(filter)) {
            _iBeaconFilter.remove(i);
        }
    }
    _lastSeen.remove(filter.getUuid());
    _inRegion.remove(filter.getUuid());
}