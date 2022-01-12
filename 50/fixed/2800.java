private void saveLog(android.preference.Preference logLoc) {
    file = com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.saveLogcat(getActivity());
    logLoc.setEnabled(true);
    logLoc.setSummary(file);
}