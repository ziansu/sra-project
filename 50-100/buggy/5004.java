public static void learnFromFile(java.lang.String[] args) {
    java.lang.String file = "";
    if ((args.length) == 1) {
        file = com.jboby93.markovbot.App.readLine("Learn from file [or #cancel to cancel]: ");
    }else {
        file = args[1];
    }
    if (!(file.equals("#cancel"))) {
        com.jboby93.markovbot.App.bot.learnFromFile(file);
        java.lang.System.out.println("Done.");
    }
}