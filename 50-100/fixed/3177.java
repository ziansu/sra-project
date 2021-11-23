public java.util.List<java.util.List<java.lang.Integer>> combine(int n, int k) {
    java.util.List<java.util.List<java.lang.Integer>> allCombs = new java.util.LinkedList<>();
    java.util.List<java.lang.Integer> oneComb = new java.util.LinkedList<>();
    generateCombs(allCombs, oneComb, 1, n, k);
    return allCombs;
}