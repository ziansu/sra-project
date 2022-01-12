public static void putSharedPrefValues(android.content.SharedPreferences sharedPreferences, java.lang.String fileName, java.lang.String posKeyName, int adapterPosition, java.lang.String stateKeyName, boolean state) {
    sharedPreferences = com.ngynstvn.android.blocparty.BlocpartyApplication.getSharedInstance().getSharedPreferences(fileName, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putInt(posKeyName, adapterPosition);
    editor.putBoolean(stateKeyName, state);
    editor.commit();
}