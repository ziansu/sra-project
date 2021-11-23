private void addDifficultyActionPerformed(java.awt.event.ActionEvent evt) {
    com.ftb2om2.util.PathGetter file = new com.ftb2om2.util.PathGetter();
    java.lang.String name = file.GetPath(false, false, false);
    if (name != null) {
        java.io.File fileName = new java.io.File(name);
        javax.swing.table.DefaultTableModel model = ((javax.swing.table.DefaultTableModel) (difficultyTable.getModel()));
        model.addRow(new java.lang.Object[]{ fileName.getName() , name , org.apache.commons.io.FilenameUtils.removeExtension(fileName.getName()) });
    }
}