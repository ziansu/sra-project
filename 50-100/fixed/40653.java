public static java.util.List<org.todss.algorithm.path.Path> findPossiblePaths(int n, int margin, int target) {
    final java.util.List<org.todss.algorithm.path.Path> paths = new java.util.ArrayList<>();
    final int[][] possibilities = org.todss.algorithm.path.PathUtilities.findPossiblePaths(n, target, (-margin), margin, org.todss.algorithm.path.PathUtilities.PATH_STEPS);
    for (int[] possibility : possibilities) {
        paths.add(new org.todss.algorithm.path.Path(possibility));
    }
    return paths;
}