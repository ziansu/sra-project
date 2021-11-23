public static int getOSID() {
    if (main.OSValidator.isWindows()) {
        return 0;
    }else
        if (main.OSValidator.isMac()) {
            return 1;
        }else
            if (main.OSValidator.isUnix()) {
                return 1;
            }else {
                return 2;
            }
        
    
}