@java.lang.Override
public void performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy configuration) {
    super.performApply(configuration);
    java.lang.String attribute = null;
    if (((workingDirPath) != null) && (new java.io.File(workingDirPath).exists())) {
        attribute = workingDirPath;
    }
    configuration.setAttribute(LaunchConfigurationConstants.ATTR_DEBUGGER_NSIM_WORKING_DIRECTORY, attribute);
}