@java.lang.Override
public synchronized float[] readFloatMDArrayBlockWithOffset(final int timepoint, final int setup, final int level, final int[] dimensions, final long[] min, final float[] dataBlock) throws java.lang.InterruptedException {
    java.lang.System.arraycopy(readFloatMDArrayBlockWithOffset(timepoint, setup, level, dimensions, min), 0, dataBlock, 0, dataBlock.length);
    return dataBlock;
}