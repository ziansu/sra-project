public boolean someNodesNotPassed() {
    for (int i = 0; i < (map.getPoints().size()); i++) {
        if (!(map.getPoints().get(i).getPassed())) {
            return true;
        }
    }
    return false;
}