public java.util.List<java.lang.String> getRoute(com.TeamHEC.gameLogic.map.Station target) {
    java.util.List<java.lang.String> path = new java.util.ArrayList<java.lang.String>();
    for (com.TeamHEC.gameLogic.map.Station Node = target; Node != null; Node = Node.next)
        path.add(Node.getName());
    
    java.util.Collections.reverse(path);
    return path;
}