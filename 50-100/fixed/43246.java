public final com.nukethemoon.tools.ani.Ani add(final com.nukethemoon.tools.ani.BaseAnimation pAnimation) {
    if (pAnimation != null) {
        for (int i = 0; i < (animations.length); i++) {
            if ((animations[i]) == null) {
                animations[i] = pAnimation;
                pAnimation.start();
                return this;
            }
        }
    }
    return this;
}