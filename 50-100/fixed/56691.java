public int hammingCost() {
    int misplaceTiles = 0;
    for (int i = 1; i < 9; i++) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if ((enviromentState[j][k]) == i) {
                    if ((cost(i)) != 0) {
                        misplaceTiles++;
                    }
                }
            }
        }
    }
    return misplaceTiles;
}