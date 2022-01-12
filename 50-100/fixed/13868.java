private void addNewButton(Sound s) {
    (currentColumn)++;
    if ((currentColumn) >= (numColumns)) {
        currentColumn = 0;
        (currentRow)++;
    }
    SoundPanel p = new SoundPanel(s);
    cells[currentRow][currentColumn].add(p);
}