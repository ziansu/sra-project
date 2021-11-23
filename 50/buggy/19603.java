public static com.nicdsmith.test.gamenight.SQLiteHelper getInstance(android.content.Context ctx) {
    if ((com.nicdsmith.test.gamenight.SQLiteHelper.mInstance) == null) {
        com.nicdsmith.test.gamenight.SQLiteHelper.mInstance = new com.nicdsmith.test.gamenight.SQLiteHelper(ctx.getApplicationContext());
    }
    return com.nicdsmith.test.gamenight.SQLiteHelper.mInstance;
}