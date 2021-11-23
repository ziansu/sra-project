public com.sherlockHomies.beans.User findUser(java.lang.String username) {
    com.sherlockHomies.beans.User user = facade.getUser(username);
    if (user == null) {
        java.lang.System.out.println("User not found");
        return null;
    }
    return user;
}