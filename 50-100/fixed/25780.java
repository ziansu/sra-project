private void NextAction() {
    this.dispose();
    if ((edu.ncsu.monopoly.GameMaster.instance().getNumberOfPlayers()) > ((playerIndex) + 1)) {
        edu.ncsu.monopoly.GameMaster.instance().promptPlayerOption(((playerIndex) + 1));
    }else {
        edu.ncsu.monopoly.GameMaster.instance().setGUIVisible();
        edu.ncsu.monopoly.GameMaster.instance().startGame();
    }
}