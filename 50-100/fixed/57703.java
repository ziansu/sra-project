public void rec(algorithm.Graph graph, int start, int ende) {
    if (start != ende) {
        if ((graph.vertices.get(start).getPrev()) != null) {
            rec(graph, graph.vertices.get(start).getPrev().getData(), ende);
            java.lang.System.out.print((start + " "));
        }
    }else {
        java.lang.System.out.print((ende + " "));
    }
}