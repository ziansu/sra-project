public static boolean isValidQuantity(java.lang.String quantityStr) {
    if ((quantityStr == null) || ((quantityStr.trim().length()) < 1)) {
        return false;
    }
    try {
        double q = java.lang.Double.parseDouble(quantityStr);
        return q > 0;
    } catch (java.lang.NumberFormatException e) {
        if (com.stocktracker.BuildConfig.DEBUG)
            android.util.Log.d(com.stocktracker.util.Utils.TAG, (("Error parsing quantity " + quantityStr) + " to double."));
        
        return false;
    }
}