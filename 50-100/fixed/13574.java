public void lookat(com.badlogic.gdx.math.Vector2 p) {
    inAnim();
    posTween = null;
    renderer.startAnimation(standAnim, Tween.Type.SPRITE_DEFINED, (-1), null, new com.badlogic.gdx.math.Vector2(bbox.getX(), bbox.getY()), p);
    outAnim(Tween.Type.SPRITE_DEFINED);
}