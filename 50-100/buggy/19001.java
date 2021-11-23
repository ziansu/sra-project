private int testGameEnd(int[][] f) {
    int DestroyedDeckNumber = 0;
    int endNum = 330;
    for (int[] aF : f) {
        for (int j = 0; j < (f.length); j++) {
            if ((aF[j]) >= 15)
                DestroyedDeckNumber += aF[j];
            
        }
    }
    if (DestroyedDeckNumber == endNum)
        return 1;
    else
        return 0;
    
}