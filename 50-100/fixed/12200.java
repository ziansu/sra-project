public void signUp(java.lang.String uname, java.lang.String email, java.lang.String pass) {
    try {
        java.sql.PreparedStatement pst = connection.prepareStatement("INSERT INTO users (uname, email, pass) VALUES (?, ?, ?)");
        pst.setString(1, uname);
        pst.setString(2, email);
        pst.setString(3, pass);
        pst.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}