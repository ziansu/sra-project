public void select(Managers.StateManager stateManager) {
    switch (currentSelection) {
        case 0 :
            stateManager.setState("Menu");
            exit();
            break;
        case 1 :
            if (states.GameState.debugging)
                states.GameState.debugging = false;
            else {
                states.GameState.debugging = true;
            }
            break;
        case 2 :
            Game.INSTANCE.stop();
            break;
        case 3 :
            stateManager.setState("Game");
            Game.INSTANCE.repaint();
    }
}