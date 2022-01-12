public com.PazzwordAPI.plugin.util.player.data.UserData getUserData(com.PazzwordAPI.plugin.util.player.User user, java.lang.String id, java.lang.String type, java.lang.Object o, boolean save) {
    com.PazzwordAPI.plugin.util.player.data.UserData data = new com.PazzwordAPI.plugin.util.player.data.UserData(id, type, o, save);
    for (com.PazzwordAPI.plugin.util.player.data.DataHandler handler : this.getUserDataHandlers())
        if (handler.handles(type)) {
            data = handler.handle(data);
        }
    
    return data;
}