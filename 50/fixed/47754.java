@java.lang.Override
public double getMinimumHeight() {
    org.eclipse.elk.core.math.ElkPadding padding = getPadding();
    return ((minimumContentAreaSize.y) + (padding.top)) + (padding.bottom);
}