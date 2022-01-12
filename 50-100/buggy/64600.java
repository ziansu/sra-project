public static void addMessage(java.lang.String username, java.lang.String id) {
    if (!(user.User.dbMessages.containsKey(username))) {
        user.User.dbMessages.put(username, new java.util.ArrayList<java.lang.String>());
    }
    user.User.dbMessages.get(username).add(id);
}