public int transformX(int screenWidth) {
    int trueX = ((position.width) == 0) ? 0 : screenWidth - (position.width);
    return positionType.transformX(position.x, trueX);
}