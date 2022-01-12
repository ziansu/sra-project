public static boolean hasWorldSetting(java.lang.String WorldName, java.lang.String Setting) {
    if ((de.davboecki.multimodworld.server.ModChecker.getModWorldHandlePlugin()) == null)
        return true;
    
    return de.davboecki.multimodworld.server.ModChecker.getModWorldHandlePlugin().hasWorldSetting(WorldName, Setting);
}