@java.lang.Override
public boolean isViewVisible(android.graphics.Point viewCenter, int halfWidth, int halfHeight, int endBound) {
    int viewTop = (viewCenter.x) - halfHeight;
    int viewBottom = (viewCenter.y) + halfHeight;
    return (viewTop < endBound) || (viewBottom > 0);
}