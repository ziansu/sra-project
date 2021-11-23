public static java.lang.String isConfigUpToDate(fr.neatmonster.nocheatplus.config.ConfigFile config) {
    int created = config.getInt(ConfPaths.CONFIGVERSION_CREATED);
    if (created < (fr.neatmonster.nocheatplus.config.DefaultConfig.buildNumber)) {
        return "Your configuration might be outdated.\n" + "Some settings could have changed, you should regenerate it!";
    }else
        if (created > (fr.neatmonster.nocheatplus.config.DefaultConfig.buildNumber)) {
            return "Your configuration seems to be created by a newer plugin version.\n" + "Some settings could have changed, you should regenerate it!";
        }else {
            return null;
        }
    
}