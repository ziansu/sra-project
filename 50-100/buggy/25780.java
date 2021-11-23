private void NextAction() {
    if ((edu.ncsu.monopoly.GameMaster.instance().getNumberOfPlayers()) < (playerIndex)) {
        edu.ncsu.monopoly.GameMaster.instance().promptPlayerOption(((playerIndex) + 1));
    }else {
        edu.ncsu.monopoly.GameMaster.instance().setGUIVisible();
        edu.ncsu.monopoly.GameMaster.instance().startGame();
    }
    this.dispose();
}