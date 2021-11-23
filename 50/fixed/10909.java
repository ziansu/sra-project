public java.lang.Boolean addUser(com.melodies.bandup.helper_classes.User u) {
    if (u != null) {
        userList.add(u);
        return true;
    }else {
        return false;
    }
}