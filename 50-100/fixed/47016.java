public boolean save(@javax.annotation.Nonnull
java.lang.String databaseName, @javax.annotation.Nullable
T e) {
    if (e == null) {
        return false;
    }
    if (e.isNewRecord()) {
        long newId = insert(databaseName, e);
        return newId > 0;
    }else {
        int count = update(databaseName, e);
        return count != 0;
    }
}