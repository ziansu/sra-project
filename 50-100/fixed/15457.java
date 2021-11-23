@org.spongepowered.api.event.Listener
public void breakBlock(org.spongepowered.api.event.block.ChangeBlockEvent.Break event, @org.spongepowered.api.event.filter.cause.Root
org.spongepowered.api.entity.living.player.Player player) {
    if ((this.plugin.getPlayerWandActivationStates().containsKey(player.getUniqueId())) && (this.plugin.getPlayerWandActivationStates().get(player.getUniqueId()))) {
        if ((player.get(Keys.GAME_MODE).get()) == (org.spongepowered.api.entity.living.player.gamemode.GameModes.CREATIVE)) {
            event.setCancelled(true);
        }
    }
}