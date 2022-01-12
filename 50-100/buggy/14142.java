public void move(int to) {
    int i = piece.atIndex();
    if (i > to) {
        if ((i - to) > 6) {
            jump(Direction.UP, getJumpLeftRight(to));
        }else {
            simple(Direction.UP, getSimpleLeftRight(to));
        }
    }else {
        if ((to - i) > 6) {
            jump(Direction.DOWN, getJumpLeftRight(to));
        }else {
            simple(Direction.DOWN, getJumpLeftRight(to));
        }
    }
}