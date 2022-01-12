public void initializeBoard() {
    java.util.Random r = new java.util.Random();
    for (int i = 1; i < ((M) + 1); i++) {
        for (int j = 1; j < ((N) + 1); j++) {
            byte number = ((byte) ((java.lang.Math.abs(r.nextInt())) % 2));
            boardA[i][j] = number;
        }
    }
}