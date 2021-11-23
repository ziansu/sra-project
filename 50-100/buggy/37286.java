public void animateSetPosition(java.util.List<net.offbeatpioneer.retroengine.core.sprites.AbstractSprite> childs, android.graphics.PointF position) {
    for (net.offbeatpioneer.retroengine.core.sprites.AbstractSprite child : childs) {
        if (child.hasChildren()) {
            animateSetPosition(child.getChildren(), position);
        }
        child.setPosition(new android.graphics.PointF(position.x, position.y));
    }
}