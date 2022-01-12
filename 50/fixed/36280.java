@java.lang.Override
void call(org.bukkit.event.Event ev) {
    callWithEntity(ev, ((org.bukkit.event.player.PlayerInteractEntityEvent) (ev)).getRightClicked());
}