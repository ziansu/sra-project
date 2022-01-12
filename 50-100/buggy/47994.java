private static boolean isModLoaded(java.lang.String modid, java.lang.String version) {
    if ("Minecraft".equals(modid)) {
        return true;
    }
    for (cpw.mods.fml.common.ModContainer mod : cpw.mods.fml.common.Loader.instance().getModList()) {
        if ((mod.getModId().equals(modid)) && (mod.getVersion().startsWith(version))) {
            return true;
        }
    }
    return false;
}