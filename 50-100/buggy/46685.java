public static void afficheConsole(boolean[][] grille) {
    for (boolean[] ligne : grille) {
        java.lang.System.out.print("|");
        for (boolean tile : ligne) {
            java.lang.System.out.print((tile ? "O|" : " |"));
        }
        java.lang.System.out.println("");
    }
}