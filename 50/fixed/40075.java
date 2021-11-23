public byte[] getProfilePicture(model.user.User user) {
    return userDAO.getProfilePicture(user);
}