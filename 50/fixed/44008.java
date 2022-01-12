public com.wasteofplastic.greenhouses.Greenhouse aboveAGreenhouse(org.bukkit.Location location) {
    for (com.wasteofplastic.greenhouses.Greenhouse g : greenhouses) {
        if (g.aboveGreenhouse(location)) {
            return g;
        }
    }
    return null;
}