private static com.daimajia.androidanimations.library.Techniques getRandomEnterAnimation() {
    int x = com.pgmacdesign.pgmacutilities.utilities.NumberUtilities.getRandomInt(0, ((com.pgmacdesign.pgmacutilities.utilities.AnimationUtilities.ENTER_ANIMATIONS.length) - 1));
    try {
        return com.pgmacdesign.pgmacutilities.utilities.AnimationUtilities.ENTER_ANIMATIONS[x];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        return com.pgmacdesign.pgmacutilities.utilities.AnimationUtilities.ENTER_ANIMATIONS[0];
    }
}