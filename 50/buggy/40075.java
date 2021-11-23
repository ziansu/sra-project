public byte[] getProfilePicture(model.user.User user) {
    try {
        return userDAO.getProfilePicture(user);
    } catch (exceptions.DatabaseException | java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}