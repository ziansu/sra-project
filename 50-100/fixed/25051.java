public static void autoUpdate(java.lang.String[] args) {
    try {
        if (com.github.sunnybat.paxchecker.update.UpdateHandler.updateAvailable()) {
            java.lang.System.out.println("Update found, downloading update...");
            com.github.sunnybat.paxchecker.update.UpdateHandler.updateProgram();
            java.lang.System.out.println("Update finished. Please manually restart the PAXChecker.");
            java.lang.System.exit(0);
        }
    } catch (java.lang.Exception e) {
        com.github.sunnybat.commoncode.error.ErrorDisplay.showErrorWindow("ERROR", "An error has occurred while attempting to update the program. If the problem persists, please manually download the latest version.", e);
        com.github.sunnybat.commoncode.error.ErrorDisplay.fatalError();
    }
}