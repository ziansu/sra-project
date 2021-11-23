@java.lang.Override
public boolean accept(java.io.File file) {
    if ((file.isDirectory()) || ((file.exists()) && (file.getName().toLowerCase().endsWith(".csv")))) {
        edu.rutgers.MOST.presentation.GraphicalInterface.curSettings.add(SettingsConstants.CSV_SETTINGS_NAME, file.getAbsolutePath());
        return true;
    }
    return false;
}