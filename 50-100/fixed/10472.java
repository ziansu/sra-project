public static void alimentarMatriz(int[][] matriz) {
    for (int linha = 0; linha < (matriz.length); linha++) {
        for (int coluna = 0; coluna < (matriz[0].length); coluna++) {
            java.util.Random random = new java.util.Random();
            matriz[linha][coluna] = random.nextInt(11);
        }
    }
}