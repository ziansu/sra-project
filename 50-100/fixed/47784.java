public char[][] spiele(int arraySpalte, char playerZeichen) throws java.lang.Exception {
    for (int zeile = 0; zeile < 7; zeile++) {
        if (zeile == 6) {
            throw new java.lang.IllegalArgumentException("Spalte ist voll");
        }else
            if ((spielfeld[arraySpalte][zeile]) == '.') {
                spielfeld[arraySpalte][zeile] = playerZeichen;
                break;
            }
        
    }
    return spielfeld;
}