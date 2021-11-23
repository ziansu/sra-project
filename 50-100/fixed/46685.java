public static void afficheConsole(boolean[][] grille) {
    for (int i = 0; i < (grille[0].length); i++) {
        java.lang.System.out.print("|");
        for (int j = 0; j < (grille.length); j++) {
            java.lang.System.out.print((grille[j][i] ? "O|" : " |"));
        }
        java.lang.System.out.println();
    }
}