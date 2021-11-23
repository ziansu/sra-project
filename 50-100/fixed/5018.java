public static void main(java.lang.String[] args) {
    int[] input1 = new int[]{ 1 , 0 , 0 , 1 , 1 , 0 };
    int[] input2 = new int[]{ 0 , 1 , 1 , 0 , 1 , 1 };
    com.interview.array.LongestSameSumSpan lsss = new com.interview.array.LongestSameSumSpan();
    java.lang.System.out.print(lsss.longestSpan(input1, input2));
}