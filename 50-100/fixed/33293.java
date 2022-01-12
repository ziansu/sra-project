public boolean isValidLocation(int xPos, int yPos) {
    boolean outOfBounds = (((xPos < 0) || (yPos < 0)) || (xPos >= (nodes.length))) || (yPos >= (nodes[0].length));
    return !(outOfBounds || (invalidTile(xPos, yPos)));
}