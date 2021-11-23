@java.lang.Override
void call(org.bukkit.event.Event ev) {
    callWithEntity(event, ((org.bukkit.event.player.PlayerInteractEntityEvent) (ev)).getRightClicked());
}