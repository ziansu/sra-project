public void printRouteandDistance(algorithm.Graph graph, int ende, int start) {
    if (start != ende) {
        rec(graph, graph.vertices.get(ende).getPrev().getData(), start);
        java.lang.System.out.println(ende);
    }else {
        java.lang.System.out.println(ende);
    }
    java.lang.System.out.println(("Distance = " + (graph.vertices.get(ende).getDistance())));
}