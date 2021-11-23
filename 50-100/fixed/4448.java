public void startPuzzle() {
    java.lang.System.out.println(isSolved);
    while (!(isSolved)) {
        Action a = UserInterface.promptUserForPuzzle();
        UserInterface.setGameTextArea(checkSolution(a));
    } 
    UserInterface.setGameTextArea("Puzzle Solved! Continue Investigating...");
    UserInterface.gameButtonsOn(true);
}