private java.lang.String checkAndFormatForMapRow(java.lang.String row) {
    row = row.trim();
    if ((row.length()) > (uk.ac.ncl.csc8005.team3.coreEngine.IOMethods.MAX_COLS)) {
        row = row.substring(0, uk.ac.ncl.csc8005.team3.coreEngine.IOMethods.MAX_COLS);
    }
    for (int i = 0; i < (row.length()); i++) {
        if (!(checkCharacter(row.charAt(i)))) {
            return null;
        }
    }
    return row;
}