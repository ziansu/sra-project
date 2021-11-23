private static com.yf833.Node IDFS(com.yf833.Node root) {
    com.yf833.Node start = root;
    for (int i = 0; i < (com.yf833.Main.MAX_DEPTH); i++) {
        com.yf833.Node g = com.yf833.Main.DLS(start, i);
        if (g != null) {
            return g;
        }
    }
    return null;
}