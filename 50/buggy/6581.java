public void addPoints(java.lang.Integer[] deltas) {
    if (deltas != null) {
        for (int delta : deltas) {
            addPoint(delta);
        }
    }
}