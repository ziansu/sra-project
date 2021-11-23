static void log(java.lang.String entry) {
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    java.util.Date date = new java.util.Date();
    entry = ((dateFormat.format(date)) + " ") + entry;
    ChatBot.Logger.getLogsWriter().println(entry);
}