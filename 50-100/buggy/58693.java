private void logError(java.lang.Exception e, int line) {
    FMLLog.log.error(((("[Quark Custom Emotes] Error loading line " + line) + " of emote ") + (file)));
    if (!(e instanceof java.lang.IllegalArgumentException)) {
        FMLLog.log.error("[Quark Custom Emotes] This is an Internal Error, and not one in the emote file, please report it");
        e.printStackTrace();
    }else
        FMLLog.log.error(("[Quark Custom Emotes] " + (e.getMessage())));
    
}