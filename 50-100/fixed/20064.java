@org.bukkit.event.EventHandler
public void onCollideVehicleSpectator(org.bukkit.event.vehicle.VehicleEntityCollisionEvent e) {
    if (((e.getEntity()) instanceof com.thebubblenetwork.api.game.Player) && (isSpectating(((com.thebubblenetwork.api.game.Player) (e.getEntity()))))) {
        e.setCollisionCancelled(true);
        e.setPickupCancelled(true);
        e.setCancelled(true);
    }
}