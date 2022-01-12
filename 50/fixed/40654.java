public static void setUp(android.content.Context context, java.lang.String sharedPreferencesName) {
    if (context == null) {
        throw new com.marcohc.architecture.common.helper.PreferencesException("Context must not be null!");
    }
    com.marcohc.architecture.common.helper.PreferencesHelper.instance = new com.marcohc.architecture.common.helper.PreferencesHelper(context, sharedPreferencesName, null);
}