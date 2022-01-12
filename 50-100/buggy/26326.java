private void createUniverse() {
    universe = new com.sun.j3d.utils.universe.SimpleUniverse(canvas);
    universe.getViewingPlatform().setNominalViewingTransform();
    universe.getViewer().getView().setSceneAntialiasingEnable(true);
    universe.getViewer().getView().setFrontClipDistance(1.0);
    universe.getViewer().getView().setBackClipDistance(1000.0);
    universe.getViewer().getView().setMinimumFrameCycleTime(10);
    updateVP();
}