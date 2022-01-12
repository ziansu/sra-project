@java.lang.Override
protected com.itr.dlaxist.BarcodeScan doInBackground(com.datalogic.decode.DecodeResult... params) {
    com.itr.dlaxist.BarcodeScan barcode = null;
    try {
        com.datalogic.decode.DecodeResult decodeResult = params[0];
        java.lang.String str = "";
        if (decodeResult != null) {
            java.lang.String str1 = decodeResult.getText();
            if (str1 != null) {
                str = str1;
            }
        }
        barcode = new com.itr.dlaxist.BarcodeScan(new com.itr.dlaxist.BarcodeScan("UPC", str));
    } catch (com.itr.dlaxist.ScannerException e) {
        e.printStackTrace();
    }
    return barcode;
}