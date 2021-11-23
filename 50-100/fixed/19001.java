private int testGameEnd(int[][] field) {
    int DestroyedDeckNumber = 0;
    int endNum = 330;
    for (int[] aF : field) {
        for (int j = 0; j < (field.length); j++) {
            if ((aF[j]) >= 15)
                DestroyedDeckNumber += aF[j];
            
        }
    }
    if (DestroyedDeckNumber == endNum)
        return 1;
    else
        return 0;
    
}