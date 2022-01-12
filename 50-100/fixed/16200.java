public static void updateOnlineUsers() {
    java.util.ArrayList<model.entity.OnlineUser> tmp = new java.util.ArrayList<>();
    tmp.addAll(model.entity.Server.onlineUsers);
    model.entity.Message msg = new model.entity.Message(Constant.UPDATE_ONLINE_USERS, tmp);
    for (java.lang.String key : model.entity.Server.serverThreads.keySet()) {
        model.entity.Server.serverThreads.get(key).sendMessage(msg);
    }
}