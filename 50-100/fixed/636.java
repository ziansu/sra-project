private void shiftImageLeft(int offset) {
    if (offset == 0) {
        return ;
    }
    for (int y = 0; y < (com.northvine.reader.BarcodeImage.MAX_HEIGHT); y++) {
        for (int x = offset; x < (com.northvine.reader.BarcodeImage.MAX_WIDTH); x++) {
            barcodeImage.setPixel(y, (x - offset), barcodeImage.getPixel(y, x));
            barcodeImage.setPixel(y, x, false);
        }
    }
}