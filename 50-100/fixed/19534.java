@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    gameController.changeDelay(0);
    if (((gameController.getCurrentGame()) == null) && ((gameController.getNextMatch()) != null)) {
        startGame(true);
    }else {
        warningMessage("Please wait until the current match is finished!");
    }
}