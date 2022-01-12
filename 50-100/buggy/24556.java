static void log(java.lang.String entry) {
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    java.util.Date date = new java.util.Date();
    entry = ((dateFormat.format(date)) + " ") + entry;
    try {
        ChatBot.Logger.getLogsWriter().println(entry);
    } catch (java.lang.Exception e) {
        ChatBot.Logger.logException(e);
        java.lang.System.exit(3);
    }
}