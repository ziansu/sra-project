private void updateContext() {
    geometry.geom2d.AlignedBoundingBox screen = new geometry.geom2d.AlignedBoundingBox(geometry.geom2d.Point2D.ORIGIN, cameraManager.getCamCorner());
    java.util.List<model.battlefield.army.components.Unit> inScreen = new java.util.ArrayList<>();
    for (model.battlefield.army.components.Unit u : model.battlefield.army.ArmyManager.getUnits()) {
        if (screen.contains(spatialSelector.getScreenCoord(view.math.Translator.toVector3f(u.getPos())))) {
            inScreen.add(u);
        }
    }
    controller.CommandManager.createContextualUnities(inScreen);
}