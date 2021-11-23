public static nodebox.function.Colorizable colorize(nodebox.function.Colorizable shape, nodebox.function.Color fill, nodebox.function.Color stroke, double strokeWidth) {
    if (shape == null)
        return null;
    
    nodebox.function.Colorizable newShape = shape.clone();
    newShape.setFill(fill);
    if (strokeWidth > 0) {
        newShape.setStrokeColor(stroke);
        newShape.setStrokeWidth(strokeWidth);
    }else {
        newShape.setStrokeColor(null);
        newShape.setStrokeWidth(0);
    }
    return newShape;
}