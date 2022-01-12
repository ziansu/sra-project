private void clearUserEdits(int[] backup) {
    int userEdited = 0;
    for (int i = 0; i < (backup.length); i++) {
        if (((backup[i]) != (Cell.NONE)) && (!(mCells[i].isLocked()))) {
            backup[i] = Cell.NONE;
            userEdited++;
        }
    }
    android.util.Log.i("SUDOKU", (("Removed " + userEdited) + " user edits and restarted the queue"));
}