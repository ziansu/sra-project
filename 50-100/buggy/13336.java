public java.lang.String userCurrentIp(java.lang.String user) {
    java.lang.String currentIP = null;
    for (int i = 0; i < (userInfo.size()); i++) {
        if ((userInfo.get(i).username) == user)
            currentIP = userInfo.get(i).ip;
        
    }
    return currentIP;
}