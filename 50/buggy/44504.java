private void dropTetrominoSoft() {
    if ((softDropTimer) > 0.2F) {
        Gdx.app.log("softdrop", ((softDropTimer) + ""));
        softDropTimer -= 0.2F;
        if (dropTetrominoNatural()) {
            lockTetromino(false);
        }
    }
}