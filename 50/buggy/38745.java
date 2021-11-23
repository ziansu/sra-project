public static void shutdown() {
    com.almightyalpaca.discord.jdabutler.Bot.jda.shutdown();
    EventListener.executor.shutdown();
    java.lang.System.exit(0);
}