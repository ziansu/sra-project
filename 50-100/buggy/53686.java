private void SQLModifizieren(java.lang.String sql) {
    try {
        java.sql.Statement query = mconCon.createStatement();
        query.executeUpdate(sql);
    } catch (java.sql.SQLException ex) {
        javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage(), "Fail", javax.swing.JOptionPane.OK_CANCEL_OPTION);
    }
}