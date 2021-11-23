@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    mSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    mEditor = mSharedPreferences.edit();
    mFindRestaurantsButton.setOnClickListener(this);
}