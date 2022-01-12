@java.lang.Override
public android.graphics.Point resolveMove() {
    if ((difficulty) == 0) {
        int index = ((int) ((java.lang.Math.random()) * (availMoves.size())));
        return availMoves.get(0);
    }
    return new android.graphics.Point((-1), (-1));
}