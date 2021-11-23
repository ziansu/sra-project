@java.lang.Override
public java.util.Collection<com.xsoft.android.ebookreader.domain.entities.EBook> getEBookCollection() throws com.xsoft.android.ebookreader.repository.exceptions.CacheException {
    java.util.Collection<com.xsoft.android.ebookreader.domain.entities.EBook> eBookList = new java.util.ArrayList<com.xsoft.android.ebookreader.domain.entities.EBook>();
    try {
        java.util.Collection<com.xsoft.android.ebookreader.data.dbmanager.entities.DBEBook> eBookCollection = dbhelper.getEBookDao().queryForAll();
        if (eBookCollection != null) {
            eBookList = new java.util.ArrayList<>();
            for (com.xsoft.android.ebookreader.data.dbmanager.entities.DBEBook dbeBook : eBookCollection)
                eBookList.add(com.xsoft.android.ebookreader.data.ebookslist.datasources.database.EBooksListDBDataSourceImp.transformer.transform(dbeBook, com.xsoft.android.ebookreader.domain.entities.EBook.class));
            
        }
    } catch (java.sql.SQLException e) {
        throw new com.xsoft.android.ebookreader.repository.exceptions.CacheException();
    }
    return eBookList;
}