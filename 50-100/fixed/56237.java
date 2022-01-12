public void setAlias(java.lang.String nickname, java.lang.String uName) {
    try {
        final codeu.chat.common.User user = codeu.chat.client.ClientUser.usersByName.first(uName);
        if (user != null) {
            user.alias = nickname;
            codeu.chat.client.ClientUser.LOG.info("New user alias complete, Name= \"%s\" UUID=%s Alias = %s", user.name, user.id, user.alias);
        }
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("No Such User Exists!");
    }
}