private java.util.ArrayList<com.example.budget.layout.OverviewItem> getCategoriesAndProjections() {
    android.database.Cursor queryResult = db.query(com.example.budget.provider.CATEGORIES_TABLE, new java.lang.String[]{ CATEGORIES_ID_KEY , CATEGORIES_NAME_KEY , CATEGORIES_AMOUNT_KEY , CATEGORIES_IS_ACTIVE_KEY }, null, null, null, null, null);
    return createOverviewItemArrayListFromCursor(queryResult);
}