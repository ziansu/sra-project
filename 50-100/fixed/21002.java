public int authorStart() {
    return getServer().getScheduler().scheduleSyncRepeatingTask(this, new java.lang.Runnable() {
        public void run() {
            for (org.bukkit.entity.Player p : getServer().getOnlinePlayers())
                if ((!(p.hasPermission("v.admin"))) && (!(p.isOp())))
                    p.sendMessage("This server uses the Vitals plugin, made by the minecraft server 6d7.com");
                
            
        }
    }, 144000L, 144000L);
}