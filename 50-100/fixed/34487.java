public java.util.List<java.util.List<java.lang.Integer>> subsets(int[] S) {
    outer = new java.util.ArrayList<>();
    java.util.Arrays.sort(S);
    input = S;
    java.lang.System.out.println(java.util.Arrays.toString(input));
    addSubsets(input.length);
    return outer;
}