public boolean isCollidingRect(pro.Sprite s) {
    if (isCollideable()) {
        if (((((getRight()) > (s.getLeft())) && ((getLeft()) < (s.getRight()))) && ((getBottom()) > (s.getTop()))) && ((getTop()) < (s.getBottom()))) {
            java.lang.System.out.println(true);
            return true;
        }
    }
    return false;
}