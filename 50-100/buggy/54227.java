public void addPlayer(org.bukkit.entity.Player player, org.bukkit.map.MapView mapView, int yawOffset) {
    if ((plugin.getPixelTable()) != null) {
        artists.put(player, new me.Fupery.ArtMap.Protocol.CanvasRenderer(plugin, mapView, yawOffset));
        protocol.injectPlayer(player);
    }
}