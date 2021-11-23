public static java.lang.String getFadeCurrency(android.content.Context context) {
    java.lang.Boolean isFade = de.bitshares_munich.utils.Helper.containKeySharePref(context, context.getString(R.string.pref_fade_currency));
    if (isFade) {
        java.lang.String[] currency = de.bitshares_munich.utils.Helper.fetchStringSharePref(context, context.getString(R.string.pref_fade_currency)).split(" ");
        return currency[1].replace("(", "").replace(")", "");
    }else {
        return "";
    }
}