private void saveLocations() {
    for (org.bukkit.Location loc : getLocations()) {
        int entries = getLocationData().getKeys(false).size();
        getLocationData().set(java.lang.String.valueOf((entries + 1)), me.ceramictitan.playeronline.utility.Serialization.toLocationString(loc));
    }
    getLocations().clear();
}