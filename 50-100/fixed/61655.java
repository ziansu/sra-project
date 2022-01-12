@java.lang.Override
public int size() {
    io.realm.Realm r = getRealm();
    java.util.List<T> ts = r.where(clz()).findAll();
    org.newstand.datamigration.utils.Closer.closeQuietly(r);
    return ts == null ? 0 : ts.size();
}