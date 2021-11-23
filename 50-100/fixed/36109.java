public static void fillFreeTerms() {
    java.util.Random rand = new java.util.Random();
    for (int i = 0; i < (Lab2.GaussJordan.SIZE); i++) {
        Lab2.GaussJordan.FreeTerms[i] = (rand.nextDouble()) * ((rand.nextInt(1000)) - 500);
    }
}