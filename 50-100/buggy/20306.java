public boolean someNodesNotPassed() {
    for (int i = 0; i < (map.getPoints().size()); i++) {
        if (!(map.getPoints().get(i).getPassed())) {
            java.lang.System.out.println(map.getPoints().get(i));
            return true;
        }
    }
    return false;
}