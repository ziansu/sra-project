public void moveStation(com.tk_squared.jive.tkkStation s, int newIdx) {
    stations.remove(s);
    stations.add(newIdx, s);
    int iter = ((s.getIndex()) <= newIdx) ? s.getIndex() : newIdx;
    for (int i = iter; i < (stations.size()); ++i) {
        com.tk_squared.jive.tkkStation temp = stations.get(i);
        temp.setIndex(i);
        dataSource.updateStation(s, _activity);
    }
}