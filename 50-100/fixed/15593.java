@java.lang.Override
public java.lang.String getUsername(java.lang.String ip) {
    if (ip == null)
        throw new java.lang.NullPointerException("getUsername received a null ip");
    
    java.lang.String userName = null;
    for (int i = 0; i < (userInfo.size()); i++) {
        if (ip.equals(userInfo.get(i).ip)) {
            userName = userInfo.get(i).username;
        }
    }
    return userName;
}