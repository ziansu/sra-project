private void loadUserManager() {
    if ((this.userManager) == null) {
        this.userManager = new nl.lolmen.Skillz.UserManager(this);
    }
    if ((this.getServer().getOnlinePlayers().size()) != 0) {
        for (org.bukkit.entity.Player p : this.getServer().getOnlinePlayers()) {
            this.userManager.loadPlayer(p.getName());
        }
    }
}