@java.lang.Override
public boolean isLoginOK() throws com.xsoft.android.ebookreader.repository.exceptions.CacheException {
    com.xsoft.android.ebookreader.data.dbmanager.entities.DBLogin dbl = null;
    try {
        dbl = dbhelper.getLoginDao().queryBuilder().queryForFirst();
    } catch (java.sql.SQLException e) {
        throw new com.xsoft.android.ebookreader.repository.exceptions.CacheException();
    }
    return dbl != null;
}