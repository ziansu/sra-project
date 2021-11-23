@java.lang.Override
public boolean run(com.bladecoder.engine.model.VerbRunner cb) {
    com.bladecoder.engine.util.EngineLogger.debug(java.text.MessageFormat.format("ANIMATION_ACTION: {0}", animation.getAnimationId()));
    java.lang.String actorId = animation.getActorId();
    com.bladecoder.engine.model.SpriteActor a = ((com.bladecoder.engine.model.SpriteActor) (com.bladecoder.engine.model.World.getInstance().getCurrentScene().getActor(actorId, true)));
    a.startAnimation(animation.getAnimationId(), repeat, count, (wait ? cb : null));
    return wait;
}