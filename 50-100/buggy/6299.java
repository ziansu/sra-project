static void write(java.lang.String message) {
    try {
        com.aktheknight.discordbot.Logger.writer.write((message + "\n"));
        com.aktheknight.discordbot.Logger.writer.flush();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println();
        java.lang.System.out.println("ERROR. Unable to write to logging file");
        java.lang.System.out.println("Please report this to AK");
        java.lang.System.out.println();
        e.printStackTrace();
    }
}