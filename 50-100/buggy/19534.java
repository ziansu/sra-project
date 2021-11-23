@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (((gameController.getCurrentGame()) == null) && ((gameController.getNextMatch()) != null)) {
        gameController.changeDelay(60);
        startGame(false);
    }else {
        warningMessage("Please wait until the current match is finished!");
    }
}