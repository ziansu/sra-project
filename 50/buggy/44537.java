public static float getPreciseMarioXPos(final float[] marioPos) {
    return (java.lang.Math.round(marioPos[0])) / (MarioAI.MarioMethods.BLOCK_PIXEL_SIZE);
}