public static void main(java.lang.String[] args) {
    com.pingqiu.DivideConquer_max_subarray inst = new com.pingqiu.DivideConquer_max_subarray();
    int[] test = new int[]{ 13 , -3 , -25 , 20 , -3 , -16 , -23 , 18 , 20 , -7 , 12 , -5 , -22 , 15 , -4 , 7 };
    int result = inst.maxSubArray(test, 0, ((test.length) - 1));
    java.lang.System.out.println(result);
}