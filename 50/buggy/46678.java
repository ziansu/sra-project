public void moveHorizontal(int val) {
    if (!(actualFriend.getState().isSinging())) {
        vx = val;
        isFacingRight = actualFriend.getState().isFacingRight(((int) (vx)));
    }
}