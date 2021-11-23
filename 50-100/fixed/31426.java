public java.lang.String getCurrencyString(java.lang.String desireCurrency) {
    android.content.res.Resources resources = mContext.getResources();
    if (desireCurrency == null) {
        return resources.getString(R.string.euro_sign);
    }
    switch (desireCurrency) {
        case "EUR" :
            return resources.getString(R.string.euro_sign);
        case "USD" :
            return resources.getString(R.string.dollar_sign);
        case "GBP" :
            return resources.getString(R.string.pound_sign);
        default :
            return resources.getString(R.string.euro_sign);
    }
}