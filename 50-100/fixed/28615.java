public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Player One will defend the base");
    test.Runner.askName(1);
    java.lang.String teamNamePlayerOne = test.Runner.getTeamName();
    test.Runner.askName(2);
    java.lang.String teamNamePlayerTwo = test.Runner.getTeamName();
    test.Runner.game = new model.Game();
    test.Runner.game.initializeGame(teamNamePlayerOne, teamNamePlayerTwo);
}