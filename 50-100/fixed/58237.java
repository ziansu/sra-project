private void playCard(com.gamble.unopp.model.game.Turn turn) {
    this.getActualGameRound().doTurn(turn);
    this.viewManager.updateView();
    this.broadcastTurn(turn);
    if (this.getLocalPlayer().hasToChooseColor()) {
        chooseColorDialogFragment.show(getFragmentManager(), "chooseColor");
    }else {
        if (this.getLocalPlayer().isHasToCallUno()) {
            this.startUnoTimer();
        }
    }
    this.checkWinner();
}