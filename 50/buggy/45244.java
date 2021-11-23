@org.bukkit.event.EventHandler
public void onDestroyVehicleSpectator(org.bukkit.event.vehicle.VehicleDestroyEvent e) {
    if (((e.getAttacker()) instanceof com.thebubblenetwork.api.game.Player) && (com.thebubblenetwork.api.game.GameListener.isSpectating(((com.thebubblenetwork.api.game.Player) (e.getAttacker())))))
        e.setCancelled(true);
    
}