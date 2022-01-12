public static boolean toLoadImage(android.content.Context context) {
    boolean updateNonWIFI = android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.key_load_image_preference), false);
    boolean shallUpdate = ((com.goal98.flipdroid.util.NetworkUtil.isNetworkAvailable(context)) && (com.goal98.flipdroid.util.NetworkUtil.isWifi(context))) || ((((com.goal98.flipdroid.util.NetworkUtil.isNetworkAvailable(context)) && (!(com.goal98.flipdroid.util.NetworkUtil.isWifi(context)))) && (com.goal98.flipdroid.util.NetworkUtil.isGPRS(context))) && updateNonWIFI);
    return shallUpdate;
}