public nl.hnogames.domoticz.Containers.ConfigInfo getConfig() {
    nl.hnogames.domoticz.Containers.ConfigInfo config = null;
    if (prefs.contains(nl.hnogames.domoticz.Utils.SharedPrefUtil.PREF_CONFIG)) {
        java.lang.String jsonConfig = prefs.getString(nl.hnogames.domoticz.Utils.SharedPrefUtil.PREF_CONFIG, null);
        config = new nl.hnogames.domoticz.Containers.ConfigInfo(jsonConfig);
    }else
        return null;
    
    return config;
}