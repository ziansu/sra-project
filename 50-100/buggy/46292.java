@java.lang.Override
public boolean contains(int x, int y) {
    return (((x >= (bottomLeft.x)) && (x < ((bottomLeft.x) + (width)))) && (y >= (bottomLeft.y))) && (y < ((bottomLeft.y) + (height)));
}