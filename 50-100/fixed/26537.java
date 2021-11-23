private static void savePeople(java.lang.String table, java.util.List<org.wordpress.android.models.Person> peopleList, int localTableBlogId, boolean isFreshList) {
    org.wordpress.android.datasets.PeopleTable.getWritableDb().beginTransaction();
    try {
        if (isFreshList) {
            org.wordpress.android.datasets.PeopleTable.deletePeople(table, localTableBlogId);
        }
        for (org.wordpress.android.models.Person person : peopleList) {
            org.wordpress.android.datasets.PeopleTable.save(table, person, org.wordpress.android.datasets.PeopleTable.getWritableDb());
        }
        org.wordpress.android.datasets.PeopleTable.getWritableDb().setTransactionSuccessful();
    } finally {
        org.wordpress.android.datasets.PeopleTable.getWritableDb().endTransaction();
    }
}