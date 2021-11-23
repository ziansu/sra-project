private boolean finalQRReceived(java.lang.String input) {
    android.util.Log.d("finalQRReceived", ("TOTAL = " + (TOTAL_QR_CODES)));
    android.util.Log.d("finalQRReceived", ("CURRENT = " + (CURRENT_INDEX)));
    android.util.Log.d("finalQRReceived", ("index = " + (soft.swenggroup5.DecoderUtils.getQRCodeIndex(input))));
    if (((soft.swenggroup5.DecoderUtils.getQRCodeIndex(input)) == (TOTAL_QR_CODES)) && ((CURRENT_INDEX) == ((TOTAL_QR_CODES) + 1))) {
        return true;
    }
    return false;
}