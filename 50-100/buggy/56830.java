public beans.list.LiteratureList getAllLiterature() {
    java.sql.ResultSet rs;
    java.sql.Connection con = connect();
    java.sql.CallableStatement stmt;
    beans.list.LiteratureList list = null;
    try {
        stmt = con.prepareCall("{CALL get_all_literature()}");
        stmt.execute();
        rs = stmt.getResultSet();
        list = createLiteratureList(list, rs, con);
        con.close();
        return list;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return null;
    }
}