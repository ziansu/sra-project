private void onRestartGame() {
    if ((gameField.getPoints()) > 0) {
        if (!(isGameEnd)) {
            dialogShow.getNewGameDialog(this, (-3)).show();
        }else {
            doRestart();
        }
    }
}