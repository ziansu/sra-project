@java.lang.Override
public void run() {
    if ((!(com.ccTEC.releasestationapp.utils.AppGlobals.getSharedFolderLocation().equals(""))) && (!(com.ccTEC.releasestationapp.utils.AppGlobals.getUserNameForLocalServer().equals("")))) {
        com.ccTEC.releasestationapp.utils.ParseConfigFilesFromTheServer.parseConfigFileFromTheServerTaskType = 4;
        com.ccTEC.releasestationapp.utils.ParseConfigFilesFromTheServer.taskGetConfigFiles = ((com.ccTEC.releasestationapp.utils.ParseConfigFilesFromTheServer.GetConfigFiles) (new com.ccTEC.releasestationapp.utils.ParseConfigFilesFromTheServer.GetConfigFiles().execute()));
    }else {
        com.ccTEC.releasestationapp.utils.ParseConfigFilesFromTheServer.errorParsingLicenseFileOrDeviceNotFoundOnLicenseFile();
    }
}