public void setAttrs(android.content.Context context, android.util.AttributeSet attrs) {
    android.content.res.TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PreferencesButton);
    imageOn = a.getDrawable(R.styleable.PreferencesButton_image_on);
    imageOff = a.getDrawable(R.styleable.PreferencesButton_image_off);
    prefKey = a.getString(R.styleable.PreferencesButton_pref_key);
    defaultValue = a.getBoolean(R.styleable.PreferencesButton_default_value, true);
    android.util.Log.d(com.google.android.stardroid.views.PreferencesButton.TAG, ("Preference key is " + (prefKey)));
}