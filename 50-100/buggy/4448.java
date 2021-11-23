public void startPuzzle() {
    java.lang.System.out.println(isSolved);
    while (!(isSolved)) {
        java.lang.System.out.println("P 184");
        Action a = UserInterface.promptUserForPuzzle();
        java.lang.System.out.println("P 186");
        checkSolution(a);
        java.lang.System.out.println("P 187");
    } 
    UserInterface.setGameTextArea("Puzzle Solved! Continue Investigating...");
    UserInterface.gameButtonsOn(true);
}