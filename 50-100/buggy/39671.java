public void printPixels() {
    int pixelCounter = 0;
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 9; col++) {
            java.lang.System.out.print(((((pixels.get(pixelCounter)[0]) + ",") + (pixels.get(pixelCounter)[1])) + " "));
        }
        java.lang.System.out.println();
        pixelCounter++;
    }
    java.lang.System.out.println();
}