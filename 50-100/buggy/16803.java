@java.lang.Override
public boolean isViewVisible(android.graphics.Point viewCenter, int halfWidth, int halfHeight, int endBound) {
    int viewLeft = (viewCenter.x) - halfWidth;
    int viewRight = (viewCenter.y) + halfWidth;
    return (viewLeft < endBound) || (viewRight > 0);
}