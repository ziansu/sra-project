private static void check(java.util.List<java.util.List<java.lang.Integer>> S, java.util.List<java.lang.Integer> ans, java.util.List<java.lang.Integer> golden) {
    if (!(java.util.Arrays.equals(ans, golden))) {
        java.lang.System.err.println(("Your program failed on input " + S));
        java.lang.System.err.println(("Expected " + golden));
        java.lang.System.err.println(("Got " + ans));
    }
}