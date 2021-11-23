public boolean hasUser(java.net.InetAddress userAdd) {
    boolean hasUserExist = false;
    for (global.User regUser : userList) {
        if (regUser.getAddr().equals(userAdd)) {
            hasUserExist = true;
            break;
        }
    }
    return hasUserExist;
}