private void surroundEnd(int[][] f) {
    for (int i = 0; i < (f.length); i++) {
        for (int j = 0; j < (f.length); j++) {
            if ((f[i][j]) == (-2))
                f[i][j] = -1;
            
        }
    }
}