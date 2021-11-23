public void actionPerformed(java.awt.event.ActionEvent ae) {
    while ((outputDir) == null) {
        javax.swing.JOptionPane.showMessageDialog(null, "You have not selected a path that contains valid output definition files yet.\nPlease select a path now.");
        if (!(setOutputDir())) {
            return ;
        }
    } 
    getOutputClasses();
    sqlString = getSQLStatements();
    if (sqlString.equals(EdgeConvertGUI.CANCELLED)) {
        return ;
    }
    writeSQL(sqlString);
}