private int selectRowFrmTable(int clickedX, int clickedY) {
    for (int i = (table.getRowCount()) - 1; i >= 0; --i) {
        for (int j = (table.getColumnCount()) - 1; j >= 0; --j) {
            if (table.getValueAt(i, j).equals(clickedX)) {
                java.lang.System.out.println("row found");
                selectedRow = i;
                return i;
            }
        }
    }
    return -1;
}