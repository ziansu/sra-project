public boolean registerNewUser(model.User newUser) {
    try {
        allUsers.add(newUser);
        db.getPersistence(model.User.class).store(newUser);
        return true;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
}