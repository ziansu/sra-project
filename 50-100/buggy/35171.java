public static void visualizeListOfGraphs(java.util.List<edu.uci.ics.jung.graph.DirectedGraph<java.lang.Integer, main.jung.MyEdge>> graphList, java.lang.String prefix) {
    int num = 0;
    for (edu.uci.ics.jung.graph.DirectedGraph<java.lang.Integer, main.jung.MyEdge> temp : graphList) {
        main.jung.GraphQueriesAPI.visualizeGraph(temp, (prefix + (num++)));
    }
}