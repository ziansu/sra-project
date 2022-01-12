private static android.content.SharedPreferences getSharedPreferences(java.lang.String spName) {
    return com.category.base.BaseApplication.getContext().getSharedPreferences(spName, Context.MODE_PRIVATE);
}