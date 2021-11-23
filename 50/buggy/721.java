private void initGameFragment() {
    init();
    secret = createSecret();
    android.util.Log.e("GameFragment", ("createSecret - " + (secret.getValue())));
    stan.bulls.cows.db.SQliteApi.clearGameTemp();
}