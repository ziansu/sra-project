private static void setToPositionInColumn(de.hotware.blockbreaker.model.Block[][] pMatrix, int pColumn, int pPosition, de.hotware.blockbreaker.model.Block.BlockColor pColor, int pSize) {
    for (int i = pPosition; (i - pPosition) < pSize; ++i) {
        pMatrix[i][pColumn] = new de.hotware.blockbreaker.model.Block(pColor, i, pColumn);
    }
}