static void error(java.lang.String content1, java.lang.Exception e) {
    com.aktheknight.discordbot.Logger.date = new java.util.Date();
    java.lang.String output = ((com.aktheknight.discordbot.Logger.format.format(com.aktheknight.discordbot.Logger.date)) + " [ERROR] ") + content1;
    com.aktheknight.discordbot.Logger.out.println(PrintColour.RED, output);
    com.aktheknight.discordbot.Logger.write(output);
    java.io.PrintWriter pw = new java.io.PrintWriter(com.aktheknight.discordbot.Logger.writer);
    e.printStackTrace(pw);
    pw.flush();
    pw.close();
}