public boolean setFlagged(final int y, final int x, final boolean flagged) {
    madsen.Cell c = getCell(y, x);
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