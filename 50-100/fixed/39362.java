private void populateTrinkets() {
    int currY = ((-5) * (Constants.SCREEN_HEIGHT)) / 4;
    while (currY < 0) {
        int xStart = ((int) ((java.lang.Math.random()) * ((Constants.SCREEN_WIDTH) - (tWidth))));
        trinkets.add(new com.example.casier.coinjet.Trinket(xStart, currY, tWidth, tHeight, color));
        currY += (tHeight) + (trinketGap);
    } 
}