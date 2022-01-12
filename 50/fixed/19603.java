public static com.nicdsmith.test.gamenight.SQLiteHelper getInstance(android.content.Context context) {
    if ((com.nicdsmith.test.gamenight.SQLiteHelper.mInstance) == null) {
        com.nicdsmith.test.gamenight.SQLiteHelper.mInstance = new com.nicdsmith.test.gamenight.SQLiteHelper(context.getApplicationContext());
    }
    return com.nicdsmith.test.gamenight.SQLiteHelper.mInstance;
}