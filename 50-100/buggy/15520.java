@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    if (sharedPref.getBoolean(ISettings.FORCE_NEW_REGISTRY, false)) {
        startActivity(new android.content.Intent(this, br.com.paysmart.wallet.RegistryActivity.class));
    }else {
        startActivity(new android.content.Intent(this, br.com.paysmart.wallet.MainActivity.class));
    }
    finish();
}