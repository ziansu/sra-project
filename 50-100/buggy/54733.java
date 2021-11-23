public boolean isBitSet(int row, int col) {
    return ((matrix[((row << (widthAddressBits)) + (col >>> (algorithm.datastructure.matrix.BinaryMatrix.BLOCK_ADDRESS_BITS)))]) & (1L << (col & (algorithm.datastructure.matrix.BinaryMatrix.BLOCK_MASK)))) > 0;
}