public static int getMarioYPos(final float[] marioPos) {
    return ((int) (java.lang.Math.round(marioPos[1]))) / (MarioAI.MarioMethods.BLOCK_PIXEL_SIZE);
}