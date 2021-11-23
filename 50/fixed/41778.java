public java.lang.String getAlias(java.lang.String name) {
    try {
        final codeu.chat.common.User user = codeu.chat.client.ClientUser.usersByName.first(name);
        return user.alias;
    } catch (java.lang.Exception ex) {
        return "No Such User Exists!";
    }
}