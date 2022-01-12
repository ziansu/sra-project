public java.util.List<com.TeamHEC.gameLogic.map.Station> getRoute(com.TeamHEC.gameLogic.map.Station target) {
    java.util.List<com.TeamHEC.gameLogic.map.Station> path = new java.util.ArrayList<com.TeamHEC.gameLogic.map.Station>();
    for (com.TeamHEC.gameLogic.map.Station Node = target; Node != null; Node = Node.next)
        path.add(Node);
    
    java.util.Collections.reverse(path);
    return path;
}