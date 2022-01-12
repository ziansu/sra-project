@java.lang.Override
public void setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy configuration) {
    portID = "" + 1099;
    if ((portText) != null) {
        portText.setText(portID);
    }
}