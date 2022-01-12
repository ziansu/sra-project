private static void setToPositionInColumn(de.hotware.blockbreaker.model.Block[][] pMatrix, int pColumn, int pPosition, de.hotware.blockbreaker.model.Block.BlockColor pColor, int pSize) {
    pSize += pPosition;
    for (int i = pPosition; i < pSize; ++i) {
        pMatrix[i][pColumn] = new de.hotware.blockbreaker.model.Block(pColor, i, pColumn);
    }
}