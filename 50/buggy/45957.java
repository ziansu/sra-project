private void revertLayerPoints(java.util.Set<me.newyith.fortress.util.Point> layer) {
    for (me.newyith.fortress.util.Point p : layer) {
        me.newyith.fortress.core.BedrockManager.revert(model.world, p);
        me.newyith.fortress.util.Debug.msg(("reverting " + p));
    }
}