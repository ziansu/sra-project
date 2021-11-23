public java.util.List<com.level.Position> calculatePlannedRoute(com.level.Position goalPosition) {
    java.util.ArrayList<com.action.Walking.Node> points = performAStar();
    java.util.List<com.level.Position> list = new java.util.LinkedList<>();
    list.add(goalPosition);
    return list;
}