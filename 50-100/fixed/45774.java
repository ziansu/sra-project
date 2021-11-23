@java.lang.Override
protected java.lang.String[][] doInBackground(java.lang.Void... p) {
    if (!(com.emmanuelmess.simpleaccounting.dataloading.LoadMonthAsyncTask.alreadyLoading))
        com.emmanuelmess.simpleaccounting.dataloading.LoadMonthAsyncTask.alreadyLoading = true;
    else
        throw new java.lang.IllegalStateException(((("Already loading month: " + (year)) + "-") + ((month) + 1)));
    
    int[] data = tableGeneral.getIndexesForMonth(month, year);
    for (int m : data)
        rowToDBRowConversion.add(m);
    
    return tableGeneral.getAllForMonth(month, year);
}