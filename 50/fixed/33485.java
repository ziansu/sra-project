public void advance() {
    if ((frameCount) == 0) {
        return ;
    }
    framePointer = ((framePointer) + 1) % (frameCount);
}