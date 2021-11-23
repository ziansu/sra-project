public static java.util.ArrayList<java.util.ArrayList<com.sepgroup.sep.analysis.Node>> getCriticalPath(com.sepgroup.sep.analysis.Graph graph, com.sepgroup.sep.analysis.Node targetNode) {
    com.sepgroup.sep.analysis.PERTAnalysisTools.clearCritical(graph);
    java.util.ArrayList<java.util.ArrayList<com.sepgroup.sep.analysis.Node>> allPaths = new java.util.ArrayList<java.util.ArrayList<com.sepgroup.sep.analysis.Node>>();
    allPaths.add(new java.util.ArrayList<com.sepgroup.sep.analysis.Node>());
    com.sepgroup.sep.analysis.PERTAnalysisTools.backTrack(allPaths, allPaths.get(0), targetNode);
    java.lang.System.out.println(allPaths);
    return allPaths;
}