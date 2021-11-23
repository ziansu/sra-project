@java.lang.Override
public boolean isLocalPointOutsideWorldBounds(android.graphics.Point localPoint) {
    return ((((localPoint.x) < 0) || ((localPoint.x) > (getWorldWidth()))) || ((localPoint.y) < 0)) || ((localPoint.y) > (getWorldHeight()));
}