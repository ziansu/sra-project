@java.lang.Override
public void changed() {
    map.handleJunctionFailures();
    gameLogic.setState(GameState.ANIMATING);
    topBarController.displayFlashMessage("Time is passing...", Color.BLACK, 0.9F);
    if ((map.getLastBroken()) != null) {
        topBarController.displayFlashMessage(("There is a junction failure at " + (map.getLastBroken().getName())), Color.RED, 0.9F);
    }
}