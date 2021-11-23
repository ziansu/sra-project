private void surroundEnd(int[][] field) {
    for (int i = 0; i < (field.length); i++) {
        for (int j = 0; j < (field.length); j++) {
            if ((field[i][j]) == (-2))
                field[i][j] = -1;
            
        }
    }
}