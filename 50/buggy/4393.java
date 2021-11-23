public void startWalkAnim(com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 pf) {
    inAnim();
    renderer.startAnimation(walkAnim, Tween.Type.SPRITE_DEFINED, (-1), null, p0, pf);
    outAnim();
}