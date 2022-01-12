protected java.util.List<model.graph.GraphPoint> getPointsWithOneNeighbour(model.graph.Graph graph) {
    java.util.List<model.graph.GraphPoint> points = new java.util.ArrayList<>();
    for (model.graph.GraphPoint point : graph.getPoints()) {
        if ((point.getLineCount()) == 1) {
            points.add(point);
        }
    }
    return points;
}