private void onRestartGame() {
    if (((gameField.getPoints()) > 0) || (isGameEnd)) {
        if (!(isGameEnd)) {
            dialogShow.getNewGameDialog(this, (-3)).show();
        }else {
            doRestart();
        }
    }
}