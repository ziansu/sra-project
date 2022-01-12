private static void insetRect(android.graphics.RectF dst, android.graphics.RectF src, float left, float top, float right, float bottom) {
    dst.set(((src.left) + left), ((src.top) + top), ((src.right) - right), ((src.bottom) - bottom));
}