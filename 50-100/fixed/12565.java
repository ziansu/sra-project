private static void setToPositionInRow(de.hotware.blockbreaker.model.Block[][] pMatrix, int pRow, int pPosition, de.hotware.blockbreaker.model.Block.BlockColor pColor, int pSize) {
    pSize += pPosition;
    for (int i = pPosition; i < pSize; ++i) {
        pMatrix[pRow][i] = new de.hotware.blockbreaker.model.Block(pColor, pRow, i);
    }
}