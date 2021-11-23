public boolean uniqueUsername(java.lang.StringBuilder username) {
    java.util.Optional<ro.msg.edu.persistence.user.entity.User> user = userDAO.findUserByUsername(username.toString());
    if ((user.isPresent()) && ((user.get().getId()) != null)) {
        return false;
    }else
        return true;
    
}