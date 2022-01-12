public void initializeBoard() {
    java.util.Random r = new java.util.Random();
    for (int i = 0; i < (M); i++) {
        for (int j = 0; j < (N); j++) {
            byte number = ((byte) ((java.lang.Math.abs(r.nextInt())) % 2));
            boardA[i][j] = number;
        }
    }
}