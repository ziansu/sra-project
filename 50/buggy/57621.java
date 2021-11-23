public boolean isScramble(java.lang.String s1, java.lang.String s2) {
    java.util.Set<java.lang.String> set = leetcode.Problem87.scramble(s1, new java.util.HashMap<>());
    return set.contains(s2);
}