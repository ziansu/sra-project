public static void main(final java.lang.String[] args) throws java.io.IOException {
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    de.dj_steam.bot.cli.LoopingConsole.printUsageBanner();
    while (true) {
        de.dj_steam.bot.engine.RobotEngine robotEngine = new de.dj_steam.bot.engine.RobotEngine();
        java.lang.System.out.print("> ");
        java.lang.String input = br.readLine();
        robotEngine.commandBot(input);
        if (input.trim().toLowerCase().equals(de.dj_steam.bot.cli.LoopingConsole.EXIT_COMMAND)) {
            java.lang.System.out.println("exiting");
            return ;
        }
    } 
}