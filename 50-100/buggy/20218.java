public static synchronized boolean writeSettings(org.sleuthkit.autopsy.modules.fileextmismatch.FileExtMismatchSettings settings) throws org.sleuthkit.autopsy.modules.fileextmismatch.FileExtMismatchSettings.FileExtMismatchSettingsException {
    try (org.openide.util.io.NbObjectOutputStream out = new org.openide.util.io.NbObjectOutputStream(new java.io.FileOutputStream(org.sleuthkit.autopsy.modules.fileextmismatch.FileExtMismatchSettings.DEFAULT_SERIALIZED_FILE_PATH))) {
        out.writeObject(settings);
        return true;
    } catch (java.io.IOException ex) {
        throw new org.sleuthkit.autopsy.modules.fileextmismatch.FileExtMismatchSettings.FileExtMismatchSettingsException(java.lang.String.format("Failed to write settings to %s", org.sleuthkit.autopsy.modules.fileextmismatch.FileExtMismatchSettings.DEFAULT_SERIALIZED_FILE_PATH), ex);
    }
}