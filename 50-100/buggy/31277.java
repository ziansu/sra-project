public void changeUserCurrentIp(java.lang.String user, java.lang.String ip) {
    for (int i = 0; i < (userInfo.size()); i++) {
        if ((userInfo.get(i).username) == user)
            if (ip == null) {
                userInfo.get(i).ip = null;
            }else {
                userInfo.get(i).ip = ip;
            }
        
    }
}