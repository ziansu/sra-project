public void lookat(java.lang.String direction) {
    inAnim();
    posTween = null;
    renderer.startAnimation(standAnim, Tween.Type.SPRITE_DEFINED, (-1), null, direction);
    outAnim();
}