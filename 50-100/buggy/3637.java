@java.lang.Override
public void runGames() {
    gameStates.get(currentState).enter();
    while (!(shouldQuit)) {
        gameStates.get(currentState).update();
        if (gameStates.get(currentState).isFinished()) {
            gameStates.get(currentState).exit();
            (currentState)++;
            if ((currentState) > (gameStates.size())) {
                currentState = 0;
            }
            gameStates.get(currentState).enter();
        }
    } 
}