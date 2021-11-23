@java.lang.Override
public boolean contains(int x, int y) {
    return (shape1.contains(x, y)) != (shape2.contains(x, y));
}