public void setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy configuration) {
    configuration.setAttribute(IUML2JavaContants.ATTR_MODEL_PATHS, new java.util.LinkedHashSet<java.lang.String>());
    configuration.setAttribute(IUML2JavaContants.ATTR_TARGET_FOLDER_PATH, "");
    if (((targetText) != null) && ((modelTable) != null)) {
        targetText.setText("");
        for (int i = 0; i < (modelTable.getItemCount()); i++) {
            modelTable.remove(0);
        }
    }
}