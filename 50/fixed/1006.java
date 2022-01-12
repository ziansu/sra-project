public boolean deleteCommands() {
    if (!(isInherited("DeleteCommands")))
        return (java.lang.Integer.parseInt(Setting.CHAN_DELCMDS.get(this))) == 1;
    
    return getGuildExt().deletesCommands();
}