private void registerCommands() {
    org.bukkit.Bukkit.broadcastMessage("Registering commands");
    this.getCommand("wizards").setExecutor(new org.wizards.commands.PublicCommands(m_PlayerManager, m_Listener, m_Stats));
    this.getCommand("wizardsscoreboard").setExecutor(new org.wizards.commands.ScoreboardCommands(m_Scoreboard));
    this.getCommand("wizardsitem").setExecutor(new org.wizards.commands.ItemCommands(this));
    this.getCommand("wizardsgamestate").setExecutor(new org.wizards.commands.GameStateCommands(this));
    org.bukkit.Bukkit.broadcastMessage("All commands registered");
}