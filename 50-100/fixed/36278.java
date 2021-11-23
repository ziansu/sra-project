public java.lang.String[] getWearSwitches() {
    if (!(prefs.contains(nl.hnogames.domoticz.Utils.SharedPrefUtil.PREF_CUSTOM_WEAR_ITEMS)))
        return null;
    
    java.util.Set<java.lang.String> selections = prefs.getStringSet(nl.hnogames.domoticz.Utils.SharedPrefUtil.PREF_CUSTOM_WEAR_ITEMS, null);
    if (selections != null) {
        java.lang.String[] selectionValues = new java.lang.String[selections.size()];
        int i = 0;
        for (java.lang.String s : selections) {
            selectionValues[i] = s;
            i++;
        }
        return selectionValues;
    }else
        return null;
    
}