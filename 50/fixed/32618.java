private void columnBtn(int column) {
    if ((com.llamaniac.not4.avoid4.RobotActivity.game.add(column)) > 0) {
        updatePlayer();
        if (!(updateGrid())) {
            robotTurn();
        }
    }
}