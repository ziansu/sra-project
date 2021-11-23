public void rotateAllBuildings(final double angle) {
    final com.ardor3d.math.Vector3 origin = new com.ardor3d.math.Vector3();
    for (final org.concord.energy3d.model.HousePart p : org.concord.energy3d.scene.Scene.getInstance().getParts()) {
        if (p instanceof org.concord.energy3d.model.Foundation) {
            ((org.concord.energy3d.model.Foundation) (p)).rotate(angle, origin);
        }
    }
    org.concord.energy3d.scene.Scene.getInstance().redrawAll();
}