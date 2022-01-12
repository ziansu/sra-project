public static int[][] transpose(int[][] a) {
    final int[][] tmp = new int[a[0].length][a.length];
    for (int j = 0; j < (a[0].length); j++)
        for (int i = 0; i < (a.length); i++)
            tmp[j][i] = a[i][j];
        
    
    return tmp;
}