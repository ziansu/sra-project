public int getGridIndex(float xPix, float yPix) {
    int yPos = ((int) ((xPix / (gridLayout.getWidth())) * 8));
    int xPos = ((int) ((((yPix - (linearLayout.getHeight())) - (getSupportActionBar().getHeight())) / (gridLayout.getHeight())) * 8));
    return (yPos * 8) + xPos;
}