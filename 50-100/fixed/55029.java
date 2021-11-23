@java.lang.Override
public java.lang.String getIp(java.lang.String user) {
    java.lang.String userIp = null;
    for (int i = 0; i < (userInfo.size()); i++) {
        if (userInfo.get(i).username.equals(user)) {
            userIp = userInfo.get(i).ip;
            break;
        }
    }
    return userIp;
}