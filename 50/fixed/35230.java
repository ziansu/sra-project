@java.lang.Override
public some.test.AllTypes getColumnObject() {
    if (row.isNullLink(io.realm.AllTypesRealmProxy.INDEX_COLUMNOBJECT)) {
        return null;
    }
    return realm.get(some.test.AllTypes.class, row.getLink(io.realm.AllTypesRealmProxy.INDEX_COLUMNOBJECT));
}