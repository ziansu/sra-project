public static qz.deploy.DeployUtilities getSystemShortcutCreator() {
    if (qz.utils.SystemUtilities.isWindows()) {
        return new qz.deploy.WindowsDeploy();
    }else
        if (qz.utils.SystemUtilities.isMac()) {
            return new qz.deploy.MacDeploy();
        }else {
            return new qz.deploy.LinuxDeploy();
        }
    
}