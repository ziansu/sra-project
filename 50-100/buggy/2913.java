@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    com.autoherosrpg.heros.characters.classes.HeroManager hm = plugin.getHeroManager();
    com.autoherosrpg.heros.hero.Hero hero = heroManager.getHero(player);
    hm.saveHero(hero, true);
    hm.removeHero(hero);
    for (com.autoherosrpg.heros.command.Command command : plugin.getCommandHandler().getCommands()) {
        if (command.isInteractive()) {
            command.cancelInteraction(player);
        }
    }
}