public static double[][] transpose(double[][] a) {
    double[][] tmp = new double[a[0].length][a.length];
    for (int j = 0; j < (a[0].length); j++)
        for (int i = 0; i < (a.length); i++)
            tmp[j][i] = a[i][j];
        
    
    return tmp;
}