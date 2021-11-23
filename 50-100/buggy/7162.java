public int getRangePixelCount(android.graphics.Rect range) {
    int top = range.top;
    int bottom = range.bottom;
    int left = range.left;
    int right = range.right;
    return (pixelCount[top][left]) - (pixelCount[bottom][right]);
}