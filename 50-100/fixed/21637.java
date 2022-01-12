public static void fillMatrix() {
    java.util.Random rand = new java.util.Random();
    for (int i = 0; i < (Lab2.GaussJordan.SIZE); i++) {
        for (int j = 0; j < (Lab2.GaussJordan.SIZE); j++) {
            Lab2.GaussJordan.Matrix[i][j] = (rand.nextDouble()) * ((rand.nextInt(1000)) - 500);
        }
    }
}