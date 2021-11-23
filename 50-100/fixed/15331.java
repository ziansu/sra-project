public static void main(java.lang.String[] args) {
    wr.leetcode.algo.maximum_subarray.Solution sol = new wr.leetcode.algo.maximum_subarray.Solution();
    int[] arr = new int[]{ -2 , 1 , -3 , 4 , -1 , 2 , 1 , -5 , 4 };
    int[] b = new int[]{ -1 };
    java.lang.System.out.println(sol.maxSubArray(arr));
    java.lang.System.out.println(sol.maxSubArray(b));
}