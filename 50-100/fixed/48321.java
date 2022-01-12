private static void exit() {
    com.michaelRunzler.ARK.util.GitNote.logData("Exiting program...");
    com.michaelRunzler.ARK.util.GitNote.logData("Closing logfile writer...");
    if ((com.michaelRunzler.ARK.util.GitNote.logFileWriter) != null) {
        try {
            com.michaelRunzler.ARK.util.GitNote.logFileWriter.close();
        } catch (java.io.IOException e) {
            if ((e.getMessage()) != null) {
                com.michaelRunzler.ARK.util.GitNote.logData(e.getMessage());
            }else {
                com.michaelRunzler.ARK.util.GitNote.logData(e.toString());
            }
        }
    }
    java.lang.System.exit(0);
}