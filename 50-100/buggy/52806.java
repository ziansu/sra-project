public static double getBudget() {
    java.lang.String queryString = "SELECT budget FROM Budget";
    android.database.Cursor cursor = andrewly.receiptme.model.dao.SQLDatabaseConnector.getInstance().getReadableDatabase().rawQuery(queryString, new java.lang.String[0]);
    while (cursor.moveToNext()) {
        double budget = cursor.getDouble(0);
        android.util.Log.d("AllCosts", ("Budget is " + budget));
        return budget;
    } 
    cursor.close();
    return 0;
}