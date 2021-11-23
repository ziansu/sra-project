public static void main(java.lang.String[] args) {
    int[][] matrix = new int[][]{ new int[]{ 1 , 0 , 0 } , new int[]{ 1 , 0 , 9 } , new int[]{ 0 , 0 , 1 } };
    amazon.MazePath.m = matrix.length;
    amazon.MazePath.n = matrix[0].length;
    amazon.MazePath.maze = matrix;
    java.lang.System.out.println(amazon.MazePath.isPath(matrix));
}