@java.lang.Override
public boolean isKundeExistByMail(java.lang.String mailadr) {
    java.util.List<java.lang.String> kudArr = new java.util.ArrayList<java.lang.String>();
    try {
        java.sql.Statement stmt = _con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery((("SELECT K_email from KundeT where K_email = '" + mailadr) + "';"));
        stmt.close();
        while (rs.next()) {
            return true;
        } 
    } catch (java.lang.Exception e) {
    }
    return false;
}