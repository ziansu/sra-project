public <T> boolean entityExistInDb(java.lang.Class<T> classType, long id) {
    android.database.Cursor cursor = proxyRequest(getFetchByIdRequest(classType.getSimpleName(), id));
    if ((cursor != null) && ((cursor.getCount()) >= 0)) {
        return true;
    }else {
        return false;
    }
}