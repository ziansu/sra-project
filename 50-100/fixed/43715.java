public java.util.ArrayList<com.example.budget.layout.OverviewItem> createOverviewItemArrayListFromCursor(android.database.Cursor cursor) {
    java.util.ArrayList<com.example.budget.layout.OverviewItem> resultList = new java.util.ArrayList<>();
    if (cursor.moveToFirst()) {
        do {
            com.example.budget.layout.OverviewItem overviewItem = new com.example.budget.layout.OverviewItem();
            overviewItem.categoryId = cursor.getInt(BudgetDbAdapter.CATEGORIES_ID_COLUMN);
            overviewItem.categoryName = cursor.getString(BudgetDbAdapter.CATEGORIES_NAME_COLUMN);
            overviewItem.projection = cursor.getDouble(BudgetDbAdapter.CATEGORIES_AMOUNT_COLUMN);
            resultList.add(overviewItem);
        } while (cursor.moveToNext() );
    }
    return resultList;
}