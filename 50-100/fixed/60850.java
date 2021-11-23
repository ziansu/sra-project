public double[][] convertTo3x3(double[] in) {
    double[][] temp = new double[3][3];
    int k = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            java.lang.System.out.println(in[k]);
            temp[i][j] = in[k];
            k++;
        }
    }
    return temp;
}