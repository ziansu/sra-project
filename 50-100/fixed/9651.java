private ludum.dare.collision.CollisionGroup getCollisions(java.util.Map<java.lang.String, ludum.dare.collision.CollisionSequence> data) {
    ludum.dare.utils.NamedAnimation animation = animations.getCurrentAnimation();
    java.lang.String name = animation.getName();
    if (data.containsKey(name)) {
        ludum.dare.collision.CollisionSequence sequence = data.get(name);
        if ((animation.getLastCalledFrame()) < (sequence.frames.length)) {
            return sequence.frames[animation.getLastCalledFrame()];
        }
    }
    return null;
}