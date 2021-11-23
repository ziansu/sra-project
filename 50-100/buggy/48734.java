@java.lang.Override
public javafx.scene.paint.Color getColor(int x, int y) {
    if ((x < 0) || ((width) <= x)) {
        throw new java.lang.IllegalArgumentException((("x=" + x) + " is illegal"));
    }
    if ((y < 0) || ((height) <= x)) {
        throw new java.lang.IllegalArgumentException((("x=" + x) + " is illegal"));
    }
    return transformer.apply(x, y, image);
}