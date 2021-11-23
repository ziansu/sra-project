@org.junit.Test
public void rowAndColumnTest() {
    int rowCount = categoryTableModel.getRowCount();
    int columnCount = categoryTableModel.getColumnCount();
    for (int i = 0; i < (rowCount - 1); i++) {
        for (int j = 0; j < (columnCount - 1); j++) {
            org.junit.Assert.assertNotNull(categoryTableModel.getValueAt(j, j));
        }
    }
}