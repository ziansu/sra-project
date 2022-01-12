public java.lang.String getUpdateVersionName() {
    switch (getType()) {
        default :
        case UNIVERSAL :
            return getUniversalUpdater().getUpdateDataUpdateName();
        case BUKKIT :
            java.lang.String version = getBukkitUpdater().getLatestName();
            version = version.toLowerCase().replace(" ", "").replace("dungeon", "").replace("maze", "").trim();
            return version;
    }
}