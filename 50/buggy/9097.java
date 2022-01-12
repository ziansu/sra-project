private static boolean numberIsThree(minesweeper.Pixel squareOffset) {
    minesweeper.PixelColors threePixelColors = new minesweeper.PixelColors(minesweeper.ComputerVision.threePixel, squareOffset);
    if (((threePixelColors.blue) < 20) && ((threePixelColors.green) < 10)) {
        return true;
    }
    return false;
}