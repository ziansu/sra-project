@java.lang.Override
public boolean queryFromCache() {
    return db.queryGroups(visitor);
}