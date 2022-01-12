public static int[] barcodeToIntArray(java.lang.String barcode) {
    java.lang.String[] barcodeArray = barcode.trim().split("(?!^)");
    int[] barcodeToInt = new int[barcodeArray.length];
    for (int i = 0; i < (barcodeArray.length); i++) {
        barcodeToInt[i] = java.lang.Integer.parseInt(barcodeArray[i]);
    }
    return barcodeToInt;
}