public alexeychurchill.github.io.bresenhamlines.graphics.primitives.Point transformPoint(alexeychurchill.github.io.bresenhamlines.graphics.primitives.Point point) {
    alexeychurchill.github.io.bresenhamlines.graphics.primitives.Point newPoint = point;
    for (alexeychurchill.github.io.bresenhamlines.graphics.transforms.Transform transform : transforms) {
        newPoint = transform.transform(point);
    }
    return newPoint;
}