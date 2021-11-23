public boolean deleteCommands() {
    if (!(isInherited("DeleteCommands")))
        return ((java.lang.Boolean) (Setting.CHAN_DELCMDS.get(this)));
    
    return getGuildExt().deletesCommands();
}