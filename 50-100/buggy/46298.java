public boolean setFlagged(final int x, final int y, final boolean flagged) {
    madsen.Cell c = getCell(x, y);
    boolean updated = false;
    if (c != null) {
        c.setFlagged(flagged);
        if (flagged) {
            (numFlagged)++;
        }else {
            (numFlagged)--;
        }
        updated = true;
    }
    return updated;
}