@java.lang.Override
public void maybeNewProjectDirectory(java.lang.String aProjectDirectory, java.lang.String aChecksName) {
    if (aProjectDirectory.equals(projectDirectry))
        return ;
    
    reset();
    projectDirectry = aProjectDirectory;
    logFileName = (((((unc.tools.checkstyle.ACheckStyleLogFileManager.logDirectory(aProjectDirectory)) + "/") + (AConsentFormVetoer.LOG_DIRECTORY)) + "/") + aChecksName) + ".csv";
    readLogFile();
}