public static final void setEnvironment(final com.oracle.truffle.api.object.DynamicObject obj, final com.oracle.truffle.api.object.DynamicObject value) {
    com.oracle.truffle.api.object.Shape oldShape = obj.getShape();
    com.oracle.truffle.api.object.Shape newShape = oldShape.createSeparateShape(obj.getShape().getSharedData()).replaceProperty(oldShape.getProperty(som.vmobjects.SReflectiveObject.ENVIRONMENT), com.oracle.truffle.api.object.Property.create(som.vmobjects.SReflectiveObject.ENVIRONMENT, oldShape.allocator().constantLocation(value), 0));
    obj.setShapeAndGrow(oldShape, newShape);
}