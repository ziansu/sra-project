public java.sql.ResultSet getDetails(java.lang.String qry, java.lang.String param, Main.ConnDetails connDeets) {
    try {
        java.sql.Connection conn = connecting.CreateConnection(connDeets);
        java.sql.PreparedStatement st2 = conn.prepareStatement((qry + param));
        qryResults = st2.executeQuery();
        if ((qryResults) == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "null query");
        }
    } catch (java.lang.Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
    }
    return qryResults;
}