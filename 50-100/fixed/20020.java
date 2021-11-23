private com.tetris.saar.tetris.Blocks fromPosToBlock(final int i, final int j) {
    if (this.poistionHistory.contains(new int[i][j])) {
        return this.blocksHistory.get(this.poistionHistory.indexOf(new int[i][j]));
    }
    return null;
}