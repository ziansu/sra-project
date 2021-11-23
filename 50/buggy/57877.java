public void removeRow(int rowIndex) {
    if ((rowIndex >= 0) && (rowIndex < (trackList.getSize()))) {
        trackList.removeTrackInfo(rowIndex);
        fireTableDataChanged();
    }
}