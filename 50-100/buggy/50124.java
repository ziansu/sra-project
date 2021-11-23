private void animateSetPosition(net.offbeatpioneer.retroengine.core.sprites.ISpriteGroup group, android.graphics.PointF position) {
    java.util.List<net.offbeatpioneer.retroengine.core.sprites.AbstractSprite> childs = getChildrensFromSpriteGroup(group);
    for (net.offbeatpioneer.retroengine.core.sprites.AbstractSprite child : childs) {
        if (child.hasChildren()) {
            animateSetPosition(((net.offbeatpioneer.retroengine.core.sprites.ISpriteGroup) (child)), position);
        }
        child.translate(position);
    }
}