public void endRound() {
    com.likeapig.build.arena.Timer.get().stopTasks(this);
    countdown = 0;
    message(((((org.bukkit.ChatColor.YELLOW) + "The word was ") + (word)) + "."));
    Particles.Particles.get().removeBuilderEffect();
    Particles.Particles.get().removePlayerEffect();
    for (org.bukkit.entity.Player p : getPlayers()) {
        com.likeapig.build.arena.DisguiseClass.disguise(p, p.getName());
    }
    startNewRound();
}