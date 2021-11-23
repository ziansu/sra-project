public java.util.List<java.lang.String> getPreferences(eu.hyvar.preferences.HyProfile preferenceModel, java.util.Date date, eu.hyvar.reconfigurator.input.format.Context dateContext, java.util.List<java.util.Date> sortedDateList) {
    java.util.List<java.lang.String> preferences = new java.util.ArrayList<java.lang.String>();
    if (preferenceModel == null) {
        return preferences;
    }
    for (eu.hyvar.preferences.HyPreference preference : preferenceModel.getPreferences()) {
        java.lang.String preferenceString = getPreference(preference, date, dateContext, sortedDateList);
        if (preferenceString != null) {
            preferences.add(preferenceString);
        }
    }
    return preferences;
}