public boolean uniqueUsername(java.lang.StringBuilder username) {
    java.util.Optional<ro.msg.edu.persistence.user.entity.User> user = userDAO.findUserByUsername(username.toString());
    return (user.isPresent()) && ((user.get().getId()) != null);
}