public static boolean isValidChangeValue(java.lang.String quantityStr) {
    if ((quantityStr == null) || ((quantityStr.trim().length()) < 1)) {
        return false;
    }
    try {
        double q = java.lang.Float.parseFloat(quantityStr);
        return true;
    } catch (java.lang.NumberFormatException e) {
        if (com.stocktracker.BuildConfig.DEBUG)
            android.util.Log.d(com.stocktracker.util.Utils.TAG, (("Error parsing change " + quantityStr) + " to float."), e);
        
        return false;
    }
}