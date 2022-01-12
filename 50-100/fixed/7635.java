public static boolean can_paste(int x, int y, mudmap2.backend.Layer layer) {
    if (((mudmap2.Mudmap2.copy_places) == null) || (mudmap2.Mudmap2.copy_places.isEmpty()))
        return false;
    
    if (((mudmap2.Mudmap2.copy_place_locations) != null) && (layer != null)) {
        for (mudmap2.Pair<java.lang.Integer, java.lang.Integer> coordinate : mudmap2.Mudmap2.copy_place_locations)
            if (layer.exist((x + (coordinate.first)), (y + (coordinate.second))))
                return false;
            
        
    }
    return true;
}