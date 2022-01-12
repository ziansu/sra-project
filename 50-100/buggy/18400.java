public void process(long deltaTime) {
    long tmpDelta = deltaTime;
    while ((tmpDelta > 0) && ((state) == (de.pinkproblem.multipong.PongGame.RUNNING))) {
        long t = minTimeTillCollision(tmpDelta);
        for (int i = 0; i < (de.pinkproblem.multipong.PongGame.numberOfPlayers); i++) {
            player[i].process(t, ball);
        }
        setBallPosition(t);
        testAndReflect();
        testAndEnd();
        tmpDelta -= t;
    } 
}