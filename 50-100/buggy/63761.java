@java.lang.Override
public void performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy configuration) {
    configuration.setAttribute(ICDTLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY, (isDefaultWorkingDirectory() ? null : workingDir));
    java.lang.String attribute = null;
    if (((workingDirPath) != null) && (new java.io.File(workingDirPath).exists())) {
        attribute = workingDirPath;
    }
    configuration.setAttribute(LaunchConfigurationConstants.ATTR_DEBUGGER_NSIM_WORKING_DIRECTORY, attribute);
}