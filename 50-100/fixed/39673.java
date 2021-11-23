public void execute(int repeat) {
    for (int i = 1; i <= repeat; i++) {
        boolean finalized = agent.moveNext();
        while (!finalized) {
            finalized = agent.moveNext();
        } 
        agent.restart();
    }
}