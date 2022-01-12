public void setSelectedValue(Song song) {
    int rows = model.getRowCount();
    for (int i = 0; i < rows; i++) {
        Song thisSong = ((Song) (model.getValueAt(i, 3)));
        if (thisSong == song) {
            infoTable.setRowSelectionInterval(i, i);
            return ;
        }
    }
}