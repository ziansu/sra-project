private void initUi(android.content.Context ctx) {
    try {
        _db.open();
        _db.runSchemerInstall(SEED_DATA_PATH, ctx);
        _db.close();
    } catch (java.io.IOException e) {
    }
    android.widget.LinearLayout btns = ((android.widget.LinearLayout) (findViewById(R.id.color_btns)));
    cycleColors(btns);
}