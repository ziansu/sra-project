public static java.lang.String isConfigUpToDate(fr.neatmonster.nocheatplus.config.ConfigFile config) {
    java.lang.Object created = config.get(ConfPaths.CONFIGVERSION_CREATED);
    if ((created != null) && (created instanceof java.lang.Integer)) {
        int buildCreated = ((java.lang.Integer) (created)).intValue();
        if (buildCreated < (fr.neatmonster.nocheatplus.config.DefaultConfig.buildNumber)) {
            return "Your configuration might be outdated.\n" + "Some settings could have changed, you should regenerate it!";
        }else
            if (buildCreated > (fr.neatmonster.nocheatplus.config.DefaultConfig.buildNumber)) {
                return "Your configuration seems to be created by a newer plugin version.\n" + "Some settings could have changed, you should regenerate it!";
            }else {
                return null;
            }
        
    }
    return null;
}