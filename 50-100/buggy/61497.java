public void checkIntentForDB() {
    android.content.Intent intent = getIntent();
    if (intent.hasExtra("data")) {
        log("settings are up");
        start_date = getIntent().getLongExtra("start", 0);
        end_date = getIntent().getLongExtra("end", 0);
    }
}