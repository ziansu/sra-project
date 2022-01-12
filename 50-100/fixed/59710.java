private void login() {
    com.parse.ParseTwitterUtils.initialize(getResources().getString(R.string.twitter_app_key), getResources().getString(R.string.twitter_app_secret));
    com.parse.ui.ParseLoginBuilder builder = new com.parse.ui.ParseLoginBuilder(this);
    startActivityForResult(builder.build(), com.example.ninjareader.activities.LoginActivity.PARSE_LOGIN_REQUEST_CODE);
}