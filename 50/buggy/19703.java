public static int getMarioXPos(final float[] marioPos) {
    return ((int) (java.lang.Math.round(marioPos[0]))) / (MarioAI.MarioMethods.BLOCK_PIXEL_SIZE);
}