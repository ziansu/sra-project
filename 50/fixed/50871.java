public void addRssi(int rssi) {
    if ((rssiList.size()) == 1) {
        rssiList.poll();
        rssiList.add(rssi);
    }else {
        rssiList.add(rssi);
    }
}