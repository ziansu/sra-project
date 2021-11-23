private void processPlayerVSPlayerOneDeviceMove(int player, int position) {
    if (player == (fmi.engineering.software.twoplay.constants.Constants.PLAYER_1)) {
        setOBackground(levelPlayer1, position);
    }else {
        setXBackground(levelPlayer2, position);
    }
    setButtonsUnclickable();
    fillGameGrid(position, player);
    asyncService.checkForWinner(gameGrid, player, this);
    changePlayer();
}