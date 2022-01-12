@java.lang.Override
public void changed() {
    map.handleJunctionFailures();
    gameLogic.setState(GameState.ANIMATING);
    if ((map.getLastBroken()) != null) {
        topBarController.displayFlashMessage(("There is a junction failure at " + (map.getLastBroken().getName())), Color.RED, 0.9F);
    }else {
        topBarController.displayFlashMessage("Time is passing...", Color.BLACK, 0.9F);
    }
}