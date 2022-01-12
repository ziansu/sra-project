public int getGridIndex(float xPix, float yPix) {
    int xPos = ((int) ((xPix / (gridLayout.getWidth())) * 8));
    int yPos = ((int) ((((yPix - (linearLayout.getHeight())) - (getSupportActionBar().getHeight())) / (gridLayout.getHeight())) * 8));
    return (yPos * 8) + xPos;
}