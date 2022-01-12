private static void runDFS(java.util.ArrayList<org.smram.sandbox.RelatedQuestions.IUVertex> vList) {
    long startTime = java.lang.System.currentTimeMillis();
    org.smram.sandbox.RelatedQuestions.Vertex minVertex = org.smram.sandbox.RelatedQuestions.runDFS(vList);
    java.lang.System.out.println(java.lang.String.format("DFS + noPrune: MinExpCost=%.2f, Vertex=%d, time=%d", minVertex.expCost, minVertex.id, ((java.lang.System.currentTimeMillis()) - startTime)));
}