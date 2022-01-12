@java.lang.Override
public boolean create(POJO.User user) throws java.sql.SQLException {
    stmt = connect.prepareStatement("INSERT INTO User (pseudo, password, mail) VALUES (?, ?, ?)");
    stmt.setString(1, user.getPseudo());
    stmt.setString(2, user.getPassword());
    stmt.setString(3, user.getEmail());
    stmt.executeUpdate();
    stmt.close();
    java.lang.System.out.println("ici");
    return true;
}