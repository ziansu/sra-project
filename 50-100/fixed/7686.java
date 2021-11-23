public void performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy configuration) {
    configuration.setAttribute(IUML2JavaContants.ATTR_TARGET_FOLDER_PATH, targetText.getText());
    java.util.Set<java.lang.String> umlModelPaths = new java.util.LinkedHashSet<java.lang.String>();
    org.eclipse.swt.widgets.TableItem[] items = modelTable.getItems();
    for (org.eclipse.swt.widgets.TableItem tableItem : items) {
        umlModelPaths.add(tableItem.getText());
    }
    configuration.setAttribute(IUML2JavaContants.ATTR_MODEL_PATHS, umlModelPaths);
    this.update();
}