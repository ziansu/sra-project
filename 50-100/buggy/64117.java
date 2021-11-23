public static int getOSID() {
    java.lang.System.out.println(main.OSValidator.OS);
    if (main.OSValidator.isWindows()) {
        java.lang.System.out.println("This is Windows");
        return 0;
    }else
        if (main.OSValidator.isMac()) {
            java.lang.System.out.println("This is Mac");
            return 1;
        }else
            if (main.OSValidator.isUnix()) {
                java.lang.System.out.println("This is Unix or Linux");
                return 1;
            }else {
                java.lang.System.out.println("Your OS is not supported!!");
                return 2;
            }
        
    
}