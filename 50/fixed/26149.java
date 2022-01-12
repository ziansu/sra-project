private void handleIntent() {
    android.content.Intent intent = getIntent();
    date = intent.getStringExtra(CommonConstants.DATE);
    isConfirmed = intent.getBooleanExtra(CommonConstants.IS_CONFIRMED, false);
}