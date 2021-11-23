@java.lang.Override
public boolean queryFromCache() {
    db.queryAuthors(handleFilter, visitor);
    return true;
}