@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    java.lang.System.out.println(jobTitle);
    if ((salaryResultItemList) == null) {
        android.widget.Toast.makeText(getBaseContext(), "nothing", Toast.LENGTH_LONG).show();
    }else {
        salaryResultItemList = salaryResultItemDao.getSalaryResultItemDao(jobTitle, withSimilarWord, workExpFrom, workExpTo);
    }
    itemsTotal = salaryResultItemDao.getItemsTotal();
    return null;
}