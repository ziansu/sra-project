public static void log(java.lang.String toLog) {
    try {
        java.io.BufferedWriter buffWriter = new java.io.BufferedWriter(new java.io.FileWriter(nl.tudelft.scrumbledore.Logger.loggingFile, true));
        buffWriter.write(toLog);
        buffWriter.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e);
    }
}