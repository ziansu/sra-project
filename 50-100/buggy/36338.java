private physicalInternet.Hub findClosestHub(int x, int y) {
    int shortestDistance = 1000;
    physicalInternet.Hub closestHub = null;
    for (physicalInternet.Hub hub : regionalHubs) {
        int distance = ((int) (java.lang.Math.sqrt((((x - (hub.getX())) ^ (2 + (y - (hub.getY())))) ^ 2))));
        if (distance < shortestDistance) {
            shortestDistance = distance;
            closestHub = hub;
        }
    }
    return closestHub;
}