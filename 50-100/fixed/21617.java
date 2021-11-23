private static Matrix getRGBMatrix(java.awt.image.BufferedImage image) {
    int n = image.getHeight();
    int m = image.getWidth();
    double[][] data = new double[n][m];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            data[i][j] = image.getRGB(j, i);
        
    
    return new Matrix(data, true);
}