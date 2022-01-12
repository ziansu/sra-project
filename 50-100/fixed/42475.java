public void reloadPlugin() {
    reloadConfig();
    configuration = new io.minimum.minecraft.superbvote.configuration.SuperbVoteConfiguration(getConfig());
    scoreboardHandler.reload();
    org.bukkit.Bukkit.getScheduler().runTaskAsynchronously(io.minimum.minecraft.superbvote.SuperbVote.getPlugin(), io.minimum.minecraft.superbvote.SuperbVote.getPlugin().getScoreboardHandler()::doPopulate);
    getCommand("vote").setExecutor(configuration.getVoteCommand());
}