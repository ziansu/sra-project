private physicalInternet.Hub findClosestHub(int x, int y) {
    double shortestDistance = 1000;
    physicalInternet.Hub closestHub = null;
    for (physicalInternet.Hub hub : regionalHubs) {
        double distance = java.lang.Math.sqrt(((java.lang.Math.pow((x - (hub.getX())), 2)) + (java.lang.Math.pow((y - (hub.getY())), 2))));
        if (distance < shortestDistance) {
            shortestDistance = distance;
            closestHub = hub;
        }
    }
    return closestHub;
}