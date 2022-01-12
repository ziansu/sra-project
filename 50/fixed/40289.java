@java.lang.Override
protected boolean isEnabledForSelection(org.openflexo.foundation.viewpoint.ExampleDrawingShape shape, java.util.Vector<org.openflexo.foundation.viewpoint.ExampleDrawingObject> globalSelection) {
    return (shape != null) && ((shape.getCalc()) != null);
}