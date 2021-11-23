private void saveLocations() {
    int counter = 0;
    for (org.bukkit.Location loc : getLocations()) {
        getLocationData().set(java.lang.String.valueOf(counter), me.ceramictitan.playeronline.utility.Serialization.toLocationString(loc));
        counter++;
    }
    getLocations().clear();
}