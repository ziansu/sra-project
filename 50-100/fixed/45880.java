private void initUi(android.content.Context ctx) {
    if (!(checkForColorsDb())) {
        try {
            ColorsUtil.FileUtil.setupData(SEED_DATA_PATH, SAVE_FILE_PATH, ",", this);
        } catch (java.io.IOException e) {
        }
    }
    loadColors(ctx, SAVE_FILE_PATH);
    android.widget.LinearLayout btns = ((android.widget.LinearLayout) (findViewById(R.id.color_btns)));
    cycleColors(btns);
}