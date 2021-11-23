public static boolean isHandled(org.bukkit.map.MapView map) {
    if (map == null)
        return false;
    
    for (org.bukkit.map.MapRenderer renderer : map.getRenderers()) {
        if (renderer instanceof fr.moribus.imageonmap.image.Renderer)
            return true;
        
    }
    return false;
}