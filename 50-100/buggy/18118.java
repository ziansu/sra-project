public static java.lang.String generateApiKey(java.lang.String text) {
    com.hackerkernel.blooddonar.util.ApiEncrypter encrypter = new com.hackerkernel.blooddonar.util.ApiEncrypter();
    java.lang.String key = "";
    try {
        key = com.hackerkernel.blooddonar.util.ApiEncrypter.bytesToHex(encrypter.encrypt(text));
        android.util.Log.d(com.hackerkernel.blooddonar.util.Util.TAG, ("HUS: " + key));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        android.util.Log.d(com.hackerkernel.blooddonar.util.Util.TAG, ("HUS: generateApiKey: " + (e.getMessage())));
    }
    return key;
}