public static io.realm.internal.Collection createBacklinksCollection(io.realm.internal.SharedRealm realm, io.realm.internal.UncheckedRow row, io.realm.internal.Table srcTable, java.lang.String srcFieldName) {
    long backlinksPtr = io.realm.internal.Collection.nativeCreateResultsFromBacklinks(realm.getNativePtr(), row.getNativePtr(), srcTable.getNativePtr(), srcTable.getColumnIndex(srcFieldName));
    return new io.realm.internal.Collection(realm, srcTable, backlinksPtr, true);
}