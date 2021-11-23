public void load() {
    super.load();
    id = plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new java.lang.Runnable() {
        public void run() {
            if (!(components.isEmpty()))
                for (net.ghostrealms.minigame.modules.Component c : components)
                    c.update();
                
            
        }
    }, 0L, wait);
}