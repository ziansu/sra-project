public static void saveLastResultToFile() {
    java.lang.System.out.println("Enter a filename or '#cancel' to cancel.");
    java.lang.String file = readLine("save as: ");
    if (file.equals("#cancel")) {
        java.lang.System.out.println("Operation cancelled.");
    }else {
        try {
            com.jboby93.markovbot.App.writeFile(file, com.jboby93.markovbot.App.lastResult);
            java.lang.System.out.println("File saved successfully!");
        } catch (java.io.IOException e) {
            com.jboby93.markovbot.App.logStackTrace(e);
        }
    }
}