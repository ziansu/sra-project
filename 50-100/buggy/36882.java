private void init() throws java.io.FileNotFoundException {
    out = new java.io.PrintStream(new java.io.FileOutputStream("C:\\Users\\Shipra\\Desktop\\output.txt"));
    java.lang.System.setOut(out);
    impl.State randomState = createRandom(3);
    java.lang.System.out.println("Random State");
    printState(randomState);
    goalState = createGoalState(3);
    java.lang.System.out.println("Goal State");
    printState(goalState);
    nStart = new impl.Node(randomState);
    nStart.setCost(0);
    nGoal = new impl.Node(goalState);
    SMHAstar();
    AStar();
}