public int getUnitSystemType() {
    java.lang.String unitSystem = prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_UNIT_SYSTEM, null);
    if (unitSystem == null)
        return org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_UNIT_SYSTEM;
    
    return java.lang.Integer.parseInt(unitSystem.trim());
}