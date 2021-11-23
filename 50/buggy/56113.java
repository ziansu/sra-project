public void setIsActive(int row, boolean isActive) {
    activeList.set(row, isActive);
    fireTableCellUpdated(row, bigwarp.landmarks.LandmarkTableModel.ACTIVECOLUMN);
}