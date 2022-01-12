public boolean registerNewUser(model.User newUser) {
    try {
        db.getPersistence(model.User.class).store(newUser);
        allUsers.add(newUser);
        return true;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
}