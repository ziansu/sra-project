public static void main(java.lang.String[] args) {
    int[][] matrix = new int[][]{ new int[]{ 1 , 3 , 5 , 7 } , new int[]{ 2 , 4 , 7 , 8 } , new int[]{ 3 , 5 , 9 , 10 } };
    int target = 7;
    int res = new lintCode.Q38().searchMatrix(matrix, target);
    java.lang.System.out.println(res);
}