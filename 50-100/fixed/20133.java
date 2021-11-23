public void startAnimation(java.lang.String id, com.bladecoder.engine.anim.Tween.Type repeatType, int count, com.bladecoder.engine.actions.ActionCallback cb) {
    inAnim();
    if (((posTween) != null) && ((posTween) instanceof com.bladecoder.engine.anim.WalkTween))
        posTween = null;
    
    com.bladecoder.engine.util.EngineLogger.debug(((("ANIMATION: " + (this.id)) + ".") + id));
    renderer.startAnimation(id, repeatType, count, cb);
    outAnim(repeatType);
}