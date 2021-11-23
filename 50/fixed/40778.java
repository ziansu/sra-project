private void createEnableTelementryField(org.eclipse.swt.widgets.Composite parent) {
    enableTelemetry = addCheckBox(parent, TypeScriptUIMessages.ATAConfigurationBlock_enableTelemetry_checkbox_label, ts.eclipse.ide.internal.ui.preferences.ATAConfigurationBlock.PREF_INSTALL_TYPES_ENABLE_TELEMETRY, new java.lang.String[]{ "true" , "false" }, 0);
}