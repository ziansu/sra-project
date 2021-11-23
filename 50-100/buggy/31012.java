@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    mSharedPreferences = getSharedPreferences(com.bootsysoftware.golfscorecard.controller.MainActivity.PREFS_FILE, Context.MODE_PRIVATE);
    mEditor = mSharedPreferences.edit();
    com.bootsysoftware.golfscorecard.controller.MainActivity.mNumberTotalStrokesLabel = ((android.widget.TextView) (findViewById(R.id.numberTotalStrokesLabel)));
    populateHoles();
    adapter = new com.bootsysoftware.golfscorecard.adapters.HoleAdapter(this, com.bootsysoftware.golfscorecard.controller.MainActivity.mHoles);
    mListView.setAdapter(adapter);
    mListView.setEmptyView(mEmptyTextView);
}