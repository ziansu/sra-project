@java.lang.Override
public boolean isLoginOK(java.lang.String userName, java.lang.String userPass) throws com.xsoft.android.ebookreader.repository.exceptions.CacheException {
    com.xsoft.android.ebookreader.data.dbmanager.entities.DBLogin dbl = null;
    try {
        dbl = dbhelper.getLoginDao().queryBuilder().where().eq(DBLogin.FIELD_USERNAME, userName).and().eq(DBLogin.FIELD_USERPASS, userPass).queryForFirst();
    } catch (java.sql.SQLException e) {
        throw new com.xsoft.android.ebookreader.repository.exceptions.CacheException();
    }
    return dbl != null;
}