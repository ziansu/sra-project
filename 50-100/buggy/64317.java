public double findMinDistance(gameLogic.map.Station s1, gameLogic.map.Station s2) {
    for (gameLogic.dijkstra.DijkstraData d : dijkstras) {
        if ((d.getSource().getName().equals(s1.getName())) || (d.getTarget().getName().equals(s2.getName()))) {
            return d.getDistance();
        }
    }
    return -1;
}