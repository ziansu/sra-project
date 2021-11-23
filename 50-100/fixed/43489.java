public java.lang.String getUpdateVersionName() {
    switch (getType()) {
        case BUKKIT :
            return getBukkitUpdater().getLatestName().toLowerCase().replace(" ", "").replace("dungeon", "").replace("maze", "").trim();
        default :
            return getUniversalUpdater().getUpdateDataUpdateName();
    }
}