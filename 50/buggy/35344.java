public void moveRight() {
    xDirection = 3;
    x = (x) + 2;
    right = true;
    if ((imageIndex) < 10) {
        (imageIndex)++;
    }else {
        imageIndex = 0;
    }
}