public boolean isCollidingRect(pro.Sprite s) {
    if (isCollideable()) {
        if (((((getRight()) > (s.getLeft())) && ((getLeft()) < (s.getRight()))) && ((getBottom()) > (s.getTop()))) && ((getTop()) < (s.getBottom()))) {
            return true;
        }
    }
    return false;
}