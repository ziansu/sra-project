public static int naiveBruteForceCliqueVersion(boolean[][] graph, java.util.List<java.util.LinkedList<java.lang.Integer>> combinations) {
    for (int combinationCounter = 0; combinationCounter < (combinations.size()); combinationCounter++) {
        java.lang.System.out.println(((("checked/totle combinations: " + combinationCounter) + "/") + (combinations.size())));
        if (ToolBox.cliqueSolutionCheck(combinations.get(combinationCounter), graph)) {
            return combinationCounter;
        }
    }
    return 0;
}