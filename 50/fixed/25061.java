@java.lang.Override
protected void addWorldForces(java.util.ArrayList<phys2d.entities.shapes.Shape> entities) {
    for (phys2d.entities.shapes.Shape s : entities) {
        if (!(forcedShapes.contains(s))) {
            addWorldForcesTo(s, 1.0);
            forcedShapes.add(s);
        }
    }
}