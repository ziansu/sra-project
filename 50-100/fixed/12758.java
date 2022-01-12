public io.lambdacloud.util.ObjectArray set(int ms, int me, int[] aryn, io.lambdacloud.util.ObjectArray ary) {
    int row = (me - ms) + 1;
    int col = aryn.length;
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++) {
            data[(ms + i)][aryn[j]] = ary.data[i][j];
        }
    
    return this;
}