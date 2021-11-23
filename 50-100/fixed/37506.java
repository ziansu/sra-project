public static void load() {
    if (fforganizer.ResourceLoader.loaded)
        return ;
    
    if (((fforganizer.networking.ServerService.getListener().isConnected()) && (!(fforganizer.networking.ServerService.getListener().isLoading()))) && (fforganizer.login.Authentication.isLoggedIn())) {
        fforganizer.ResourceLoader.new_events = null;
        fforganizer.ResourceLoader.open_events = null;
        fforganizer.ResourceLoader.old_events = null;
        fforganizer.ResourceLoader.groups = null;
        fforganizer.networking.Server.send("events");
        fforganizer.networking.Server.send("groups");
    }
}