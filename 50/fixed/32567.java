public void getExtras() {
    if ((getIntent().getExtras()) != null) {
        mPhoneId = getIntent().getExtras().getString(Constants.Extras.PHONE_ID, null);
    }
}