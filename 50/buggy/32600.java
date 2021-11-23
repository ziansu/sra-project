public static com.example.kimichael.yandextranslate.data.objects.Language from(android.database.Cursor cursor) {
    return new com.example.kimichael.yandextranslate.data.objects.Language(cursor.getString(cursor.getColumnIndex(TranslationContract.LanguageEntry.COLUMN_LANGUAGE_KEY)), cursor.getString(cursor.getColumnIndex(TranslationContract.LanguageEntry.COLUMN_LANGUAGE_NAME)));
}