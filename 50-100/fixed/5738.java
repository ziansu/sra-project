public static void moveToLayer(nl.weeaboo.vn.core.impl.DrawablePart part, nl.weeaboo.vn.core.impl.Layer newLayer) {
    if (part == null) {
        return ;
    }
    nl.weeaboo.vn.core.impl.Layer oldLayer = part.parentLayer;
    part.parentLayer = newLayer;
    if (oldLayer != null) {
        oldLayer.invalidateStreams();
    }
    if (newLayer != null) {
        newLayer.invalidateStreams();
    }
    if (oldLayer != null) {
        nl.weeaboo.vn.core.impl.DrawablePart.LOG.debug("Moved drawable part: {} -> {}", oldLayer, newLayer);
    }
}