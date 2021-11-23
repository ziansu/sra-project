public java.lang.String findUser(int idUser) {
    assert (listBlog) >= 0 : "Unexpected error: the attribute idUser is less than 0";
    java.lang.String nickname = null;
    try {
        java.sql.Connection connection = getConnection();
        java.sql.Statement stm = connection.createStatement();
        java.sql.ResultSet rs = stm.executeQuery(("select * from Utilizador where id=" + idUser));
        while (rs.next()) {
            nickname = rs.getString("apelido");
            java.lang.System.out.println(nickname);
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return nickname;
}