private void dropTetrominoSoft() {
    if ((softDropTimer) > 0.2F) {
        softDropTimer -= 0.2F;
        if (dropTetrominoNatural()) {
            lockTetromino(false);
        }
    }
}