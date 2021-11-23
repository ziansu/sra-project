private static org.tensorics.core.tensor.Shape combineBy(java.lang.Iterable<org.tensorics.core.tensor.Shape> shapes, java.util.function.BiFunction<org.tensorics.core.tensor.Shape, org.tensorics.core.tensor.Shape, org.tensorics.core.tensor.Shape> combiner) {
    java.util.Objects.requireNonNull(shapes, "shapes must not be null");
    if (com.google.common.collect.Iterables.isEmpty(shapes)) {
        throw new java.util.NoSuchElementException("At least one shape is required.");
    }
    org.tensorics.core.tensor.Shape resultingShape = null;
    for (org.tensorics.core.tensor.Shape shape : shapes) {
        if (resultingShape == null) {
            resultingShape = shape;
        }else {
            resultingShape = combiner.apply(resultingShape, shape);
        }
    }
    return resultingShape;
}