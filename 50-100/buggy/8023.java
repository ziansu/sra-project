public static void run(Game game, AvalonBot bot) {
    for (int i = 0; i < (game.pendingMissionPlayers.size()); i++) {
        bot.sendMessage((((("Type /" + (game.gameId)) + " success or /") + (game.gameId)) + " fail"), game.pendingMissionPlayers.get(i).id);
    }
    (game.state)++;
    game.pmMissionCount = 0;
    game.missionFailCount = 0;
}