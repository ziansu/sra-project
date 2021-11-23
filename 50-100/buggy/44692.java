public static java.util.ArrayList<java.lang.Integer> writeMoves(long moves, int square) {
    java.util.ArrayList<java.lang.Integer> ans = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < 64; i++) {
        long temp = moves & (1L << i);
        if (temp != 0) {
            ans.add(((1000 * square) + (10 * i)));
        }
    }
    return ans;
}