public void calculatePath() {
    last = start;
    currentState = start;
    initialize();
    computerShotestPath();
    java.lang.System.out.println((((((thisId) + ": Start=") + (start)) + " Goal=") + (goal)));
}