public static boolean hasWorldSetting(java.lang.String WorldName, java.lang.String Setting) {
    if (!(de.davboecki.multimodworld.server.ModChecker.pluginfound))
        return false;
    
    return de.davboecki.multimodworld.server.ModChecker.getModWorldHandlePlugin().hasWorldSetting(WorldName, Setting);
}