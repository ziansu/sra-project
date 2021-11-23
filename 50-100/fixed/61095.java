public void registerEvents(org.bukkit.event.Listener... listeners) {
    org.bukkit.event.Listener[] arrayOfListener;
    int j = (arrayOfListener = listeners).length;
    for (int i = 0; i < j; i++) {
        org.bukkit.event.Listener listener = arrayOfListener[i];
        org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(listener, this);
    }
}