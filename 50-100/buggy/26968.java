public io.lambdacloud.util.ObjectArray set(int[] arym, int ns, int ne, io.lambdacloud.util.ObjectArray ary) {
    int row = arym.length;
    int col = ne - ns;
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++) {
            data[arym[i]][(ns + j)] = ary.data[i][j];
        }
    
    return this;
}