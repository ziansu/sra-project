public void startTutorial() {
    currentRound = new jeopardy.game.Round("Tutorial", 0, new jeopardy.game.RoundConfig("Tutorial", "Tutorial"));
    currentRound.start();
    tutorial = new java.util.HashSet(players.values());
    controller.onTutorialStarted();
    controller.onTutorialProgress(tutorial.size());
}