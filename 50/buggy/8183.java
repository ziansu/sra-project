public static double playOneGame(java.lang.String game_file, java.lang.String level_file, java.lang.String actionFile, int randomSeed) {
    java.lang.String agentName = "controllers.human.Agent";
    boolean visuals = true;
    return core.ArcadeMachine.runOneGame(game_file, level_file, visuals, agentName, actionFile, randomSeed);
}