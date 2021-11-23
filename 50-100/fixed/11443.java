private edu.up.cs301.blokus.Blok copySelectedBoardBlok(edu.up.cs301.blokus.Blok origSelectedBoardBlok) {
    if (origSelectedBoardBlok == null) {
        return null;
    }
    int row;
    int col;
    int color;
    row = origSelectedBoardBlok.getRow();
    col = origSelectedBoardBlok.getColumn();
    color = origSelectedBoardBlok.getColor();
    edu.up.cs301.blokus.Blok newBlok = new edu.up.cs301.blokus.Blok(row, col, color);
    return newBlok;
}