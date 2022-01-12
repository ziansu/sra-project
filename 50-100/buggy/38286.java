public static void playImpSplen() {
    try {
        if (!(FilesAndPaths.isActive)) {
            java.lang.System.out.println("Moving files into game directories");
            FileActions.moveIntoGameDirs();
            FilesAndPaths.setActiveStatus(true);
        }
        java.lang.System.out.println("Starting .exe...");
        java.lang.Runtime.getRuntime().exec("Empire.exe", null, FilesAndPaths.etwPath);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Could not run ETW.exe");
        e.printStackTrace();
    }
}