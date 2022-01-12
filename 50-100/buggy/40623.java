private static void printResults(src.UGraph graph) {
    java.lang.System.out.println(("Network Size: " + (src.Main.VIRTUAL_NET_SIZE)));
    java.lang.System.out.println(("Dijkstra from Source: " + (src.Main.SOURCE_NODE)));
    java.lang.System.out.println(("\nAll Paths From Root " + (src.Main.SOURCE_NODE)));
    graph.printAllPaths();
    java.lang.System.out.println((((("\nBest Path From " + (src.Main.SOURCE_NODE)) + " to ") + (src.Main.DEST_NODE)) + ": "));
    graph.printPath(src.Main.DEST_NODE);
    java.lang.System.out.print("\n\n\nAll Labels-->");
    graph.printVertexLabels();
}