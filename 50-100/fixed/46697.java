private void moveBack() {
    right = forward = left = 0;
    if ((back) >= (columns)) {
        back = 0;
    }
    src.set(((back) * (bmpRezolution.x)), ((bmpRezolution.y) * 3), (((back) + 1) * (bmpRezolution.x)), ((bmpRezolution.y) * 4));
    (back)++;
}