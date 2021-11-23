private void loadColors(android.content.Context ctx, java.lang.String filepath) {
    try {
        ALL_COLOR_SCHEMES = ColorsUtil.FileUtil.loadData(SEED_DATA_PATH, ",", this);
        android.widget.Toast.makeText(ctx, "Colors file loaded successfully!", Toast.LENGTH_SHORT).show();
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(ctx, "There was an error loading the file!", Toast.LENGTH_LONG).show();
    }
}