public static void addRuns(com.project.handcricket.models.Game game) {
    com.project.handcricket.models.Player batsman = game.getBatsman();
    com.project.handcricket.models.Player bowler = game.getBowler();
    batsman.setRuns(((batsman.getRuns()) + (bowler.getInput())));
}