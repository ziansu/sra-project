public void moveStation(com.tk_squared.jive.tkkStation s, int newIdx) {
    stations.remove(s);
    stations.add(newIdx, s);
    int start = ((s.getIndex()) <= newIdx) ? s.getIndex() : newIdx;
    for (int i = start; i < (stations.size()); ++i) {
        stations.get(i).setIndex(i);
    }
    dataSource.updateStation(s, _activity);
}