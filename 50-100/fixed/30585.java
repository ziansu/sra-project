@java.lang.Override
public boolean isViewVisible(android.graphics.Point viewCenter, int halfWidth, int halfHeight, int endBound) {
    int viewTop = (viewCenter.y) - halfHeight;
    int viewBottom = (viewCenter.y) + halfHeight;
    return (viewTop < endBound) && (viewBottom > 0);
}