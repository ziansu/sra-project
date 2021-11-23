private void sendPrivateMsg(java.lang.String users, java.lang.String msg) {
    java.lang.String[] userArr = users.split(",");
    for (java.lang.String user : userArr) {
        if ((serverThreadMap.get(user)) != null) {
            serverThreadMap.get(user).printWriter.println(((("[private]" + (name)) + ": ") + msg));
            log(((("\"" + msg) + "\" is sent privately to ") + user));
        }
    }
}