public static sidben.ateliercanvas.handler.CustomPaintingConfigItem findPaintingByUUID(java.util.UUID uuid) {
    if ((uuid != null) && ((sidben.ateliercanvas.handler.ConfigurationHandler.mahPaintings.size()) > 0)) {
        for (final sidben.ateliercanvas.handler.CustomPaintingConfigItem item : sidben.ateliercanvas.handler.ConfigurationHandler.mahPaintings) {
            if ((item.getUUID()) == uuid) {
                return item;
            }
        }
    }
    return null;
}