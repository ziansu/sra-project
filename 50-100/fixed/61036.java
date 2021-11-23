public int countSubstrings(java.lang.String s) {
    return leetcode.Problem647.countSubstrings(s, 0, s.length(), new boolean[(s.length()) + 1][(s.length()) + 1]);
}