private int verticalScan() {
    for (int y = (com.northvine.reader.BarcodeImage.MAX_HEIGHT) - 1; y >= 0; y--) {
        for (int x = 0; x < (com.northvine.reader.BarcodeImage.MAX_WIDTH); x++) {
            java.lang.System.out.println(java.lang.String.format("X: %s, Y: %s, Value: %s", x, y, barcodeImage.getPixel(y, x)));
            if (barcodeImage.getPixel(y, x)) {
                return y;
            }
        }
    }
    throw new java.lang.RuntimeException("The image state leaves vertical scanning undetectable");
}