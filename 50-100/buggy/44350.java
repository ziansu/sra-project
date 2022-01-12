public static qz.deploy.DeployUtilities getSystemShortcutCreator() {
    if (qz.utils.SystemUtilities.isWindows()) {
        return new qz.deploy.WindowsDeploy();
    }else
        if (qz.utils.SystemUtilities.isMac()) {
            return new qz.deploy.MacDeploy();
        }else
            if (qz.utils.SystemUtilities.isLinux()) {
                return new qz.deploy.LinuxDeploy();
            }else {
                throw new java.lang.UnsupportedOperationException("Shortcut creation for this OS is not yet supported");
            }
        
    
}