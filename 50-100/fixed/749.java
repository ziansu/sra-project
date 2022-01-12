public static boolean is_winner(java.lang.String ship_symbol, java.lang.String[][] Tablero) {
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (Tablero[i][j].equals(ship_symbol)) {
                return false;
            }
        }
    }
    return true;
}