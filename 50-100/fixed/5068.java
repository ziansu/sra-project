public static void initMap(org.bukkit.map.MapView map) {
    if (map == null)
        return ;
    
    if (fr.moribus.imageonmap.image.Renderer.isHandled(map))
        return ;
    
    java.io.File imageFile = fr.moribus.imageonmap.ImageOnMap.getPlugin().getImageFile(map.getId());
    if (imageFile.isFile()) {
        fr.moribus.imageonmap.image.ImageIOExecutor.loadImage(imageFile, fr.moribus.imageonmap.image.Renderer.installRenderer(map));
    }
}