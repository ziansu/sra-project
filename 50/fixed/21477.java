@java.lang.Override
public boolean isValidPoint(java.awt.Point p) {
    return (p != null) && ((isValidX(p.x)) && (isValidY(p.y)));
}