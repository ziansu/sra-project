public static boolean isEntityAllowed(java.lang.String WorldName, de.davboecki.multimodworld.server.Entity entity) {
    if ((de.davboecki.multimodworld.server.ModChecker.getModWorldHandlePlugin()) == null)
        return true;
    
    return de.davboecki.multimodworld.server.ModChecker.getModWorldHandlePlugin().isEntityAllowed(WorldName, entity);
}