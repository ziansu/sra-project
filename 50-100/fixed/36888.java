@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    java.lang.System.out.println(jobTitle);
    if ((salaryResultItemList) == null) {
    }else {
        salaryResultItemList = salaryResultItemDao.getSalaryResultItemDao(jobTitle, withSimilarWord, workExpFrom, workExpTo);
    }
    itemsTotal = salaryResultItemDao.getItemsTotal();
    return null;
}