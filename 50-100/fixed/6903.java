@java.lang.Override
protected void controlUpdate(float tpf) {
    if (!(com.nx.util.jme3.base.SpatialUtil.hasControl(originalSpatial, skeletonControl))) {
        cachedControls.remove(skeletonControl);
        removeFromDebug(originalSpatial, skeletonDebugger);
        return ;
    }
    if (!(skeletonDebugger.getLocalTransform().equals(originalSpatial.getWorldTransform()))) {
        skeletonDebugger.setLocalTransform(originalSpatial.getWorldTransform());
    }
}