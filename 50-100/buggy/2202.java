public void deleteDeposit(java.lang.String goalName, java.lang.String depositName, java.lang.String expenseName) {
    android.database.sqlite.SQLiteDatabase myDb = this.getWritableDatabase();
    myDb.execSQL((((("DELETE FROM " + (getGoalTableName(goalName))) + " WHERE NAME ='") + depositName) + "'"));
    deleteExpense(depositName, expenseName);
    updateGoalState(goalName);
    myDb.close();
}