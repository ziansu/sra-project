public java.awt.image.BufferedImage getNext() {
    if (((xPos) >= (numTilesHorizontalLessOne)) && ((yPos) >= (numTilesVerticalLessOne))) {
        xPos = 0;
        yPos = 0;
        return spriteSheetTiles[yPos][xPos];
    }else
        if ((xPos) >= (numTilesHorizontalLessOne)) {
            xPos = 0;
            yPos += 1;
            return spriteSheetTiles[yPos][xPos];
        }else {
            return spriteSheetTiles[yPos][(++(xPos))];
        }
    
}