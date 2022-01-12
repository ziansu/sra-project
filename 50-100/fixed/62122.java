public void actionPerformed(java.awt.event.ActionEvent arg0) {
    int row = testingPackage.TestMain.testTable.getSelectedRow();
    if (row != (-1)) {
        try {
            testingPackage.TestMain.deleteRow((row + 1));
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}