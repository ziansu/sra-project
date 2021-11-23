public void replaceShortestDist() {
    java.lang.Double shortestDistance = 0.0;
    for (java.util.Map.Entry<java.lang.Character, PathObject> current : paths.entrySet()) {
        PathObject p = current.getValue();
        if (shortestDistance == 0.0) {
            shortestDistance = p.getDist();
        }else {
            if ((p.getDist()) < shortestDistance) {
                shortestDistance = p.getDist();
            }
        }
    }
    shortestLength = shortestDistance;
}