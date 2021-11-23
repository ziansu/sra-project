private void setUpTest() {
    android.content.Intent intent = getIntent();
    if (intent.hasExtra(TestActivity.CURRENT_TEST))
        mTest = intent.getParcelableExtra(TestActivity.CURRENT_TEST);
    
}