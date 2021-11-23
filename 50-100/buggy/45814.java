public long addCatalog(org.unfoldingword.door43client.models.Catalog catalog) throws java.lang.Exception {
    validateNotEmpty(catalog.slug);
    validateNotEmpty(catalog.url);
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("slug", catalog.slug);
    values.put("url", catalog.url);
    values.put("modified_at", catalog.modifiedAt);
    return insertOrUpdate("catalog", values, new java.lang.String[]{ "slug" });
}