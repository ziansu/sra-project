public net.sf.memoranda.Event getEventAt(int row, int column) {
    try {
        return ((net.sf.memoranda.Event) (events[row].get(column)));
    } catch (java.lang.Exception e) {
        return null;
    }
}