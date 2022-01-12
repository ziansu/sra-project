public void removeDevice(int address) {
    final me.legrange.panstamp.PanStamp ps = devices.get(address);
    if (ps != null) {
        ps.destroy();
        devices.remove(address);
        fireDeviceRemoved(ps);
    }
}