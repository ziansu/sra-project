public void removeStationAt(int i) {
    com.tk_squared.tuxedo3.tkkStation s = stations.get(i);
    removeStation(s);
    dataSource.deleteStation(s);
    stations.remove(i);
}