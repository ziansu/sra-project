private static byte[] MD5(byte[] input) {
    java.security.MessageDigest md = null;
    try {
        md = java.security.MessageDigest.getInstance("MD5");
    } catch (final java.security.NoSuchAlgorithmException e) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(com.koodroid.chicken.ARHelper.TAG, "", e);
        }
    }
    if (md != null) {
        md.update(input);
        return md.digest();
    }else {
        return null;
    }
}