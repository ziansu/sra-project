private void animateResetPosition(net.offbeatpioneer.retroengine.core.sprites.ISpriteGroup group) {
    java.util.List<net.offbeatpioneer.retroengine.core.sprites.AbstractSprite> childs = getChildrensFromSpriteGroup(group);
    for (net.offbeatpioneer.retroengine.core.sprites.AbstractSprite child : childs) {
        if (child.hasChildren()) {
            animateResetPosition(((net.offbeatpioneer.retroengine.core.sprites.ISpriteGroup) (child)));
        }
        child.resetPosition();
    }
}