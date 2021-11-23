public void addRow(java.lang.String ID, java.lang.String NAME) throws java.sql.SQLException {
    try {
        conn.prepareStatement((((("INSERT INTO FACULTY (ID, NAME) VALUES (" + ID) + ", '") + NAME) + "')")).executeUpdate();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}