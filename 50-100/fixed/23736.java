public void addRow(java.lang.String ID, java.lang.String NAME, java.lang.String DESCRIPTION, java.lang.String CREDITS) throws java.sql.SQLException {
    try {
        conn.prepareStatement((((((((("INSERT INTO COURSES (ID, NAME, DESCRIPTION, CREDITS) VALUES (" + ID) + ", '") + NAME) + "', '") + DESCRIPTION) + "', ") + CREDITS) + ")")).executeUpdate();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}