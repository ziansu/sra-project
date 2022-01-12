public static void main(java.lang.String[] args) {
    int[][] matrix = new int[][]{ new int[]{ 1 , 1 , 1 } , new int[]{ 9 , 1 , 1 } , new int[]{ 0 , 1 , 0 } };
    amazon.MazePath.m = matrix.length;
    amazon.MazePath.n = matrix[0].length;
    amazon.MazePath.maze = matrix;
    java.lang.System.out.println(amazon.MazePath.isPath(matrix));
}