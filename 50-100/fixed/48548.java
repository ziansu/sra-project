private void setPreferenceChangeListener() {
    if ((onChange) == null) {
        onChange = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() {
            @java.lang.Override
            public void onSharedPreferenceChanged(android.content.SharedPreferences sp, java.lang.String s) {
                txtCurrency.setText(sp.getString("currency_pref", "CAD"));
            }
        };
    }
    android.content.SharedPreferences sp = com.bighi.expensetracker.com.bighi.expensetracker.util.AppUtil.getSharedPreferences(getBaseContext());
    sp.registerOnSharedPreferenceChangeListener(onChange);
}