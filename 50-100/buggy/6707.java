public static void printResult(double[][] reuslt) {
    int histWidth = reuslt.length;
    int histHeight = reuslt[0].length;
    for (int i = 0; i < histWidth; i++) {
        java.lang.System.out.println("");
        for (int j = 0; j < histHeight; j++) {
            java.lang.System.out.print(((reuslt[i][j]) + " "));
        }
    }
}