private static void testEmptyGraph() {
    try {
        org.smram.sandbox.RelatedQuestions.runDFS(new java.util.ArrayList<org.smram.sandbox.RelatedQuestions.IUVertex>());
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.out.println("DFS + noPrune: test empty graph: PASSED");
    }
    try {
        org.smram.sandbox.RelatedQuestions.runIterativeUpdate(new java.util.ArrayList<org.smram.sandbox.RelatedQuestions.IUVertex>());
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.out.println("IU: test empty graph: PASSED");
    }
}