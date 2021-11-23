public void moveRight() {
    right = true;
    xDirection = 2;
    if ((imageIndex) < 10) {
        (imageIndex)++;
    }else {
        imageIndex = 0;
    }
}