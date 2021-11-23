public long addSourceLanguage(org.unfoldingword.door43client.models.SourceLanguage language) throws java.lang.Exception {
    validateNotEmpty(language.slug);
    validateNotEmpty(language.name);
    validateNotEmpty(language.direction);
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("slug", language.slug);
    values.put("name", language.name);
    values.put("direction", language.direction);
    return insertOrUpdate("source_language", values, new java.lang.String[]{ "slug" }).id;
}