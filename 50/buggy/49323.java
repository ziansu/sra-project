public int getWidth() {
    int baseSize = 0;
    return ((leftChild.getWidth()) + (rightChild.getWidth())) + baseSize;
}