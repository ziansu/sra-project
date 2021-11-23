private void saveLog(android.preference.Preference logLoc) {
    java.lang.String file = com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.saveLogcat(getActivity());
    logLoc.setEnabled(true);
    logLoc.setSummary(file);
}