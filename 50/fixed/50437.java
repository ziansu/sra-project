private void setPremierTirage() {
    int plop = tirage[org.oucho.tetris.Game.rgenerator.nextInt(tirage.length)];
    currentPiece = new org.oucho.tetris.Pieces(true, plop);
}