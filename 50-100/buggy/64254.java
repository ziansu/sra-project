public static void error(java.lang.String content1, java.lang.Exception e) {
    java.lang.String output = ((com.aktheknight.discordbot.Logger.format.format(com.aktheknight.discordbot.Logger.date)) + " [ERROR] ") + content1;
    java.lang.System.out.println(output);
    com.aktheknight.discordbot.Logger.write(output);
    e.printStackTrace();
    java.io.PrintWriter pw = new java.io.PrintWriter(com.aktheknight.discordbot.Logger.writer);
    e.printStackTrace(pw);
    pw.flush();
    pw.close();
}