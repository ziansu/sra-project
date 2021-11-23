@java.lang.Override
public T findFirst() {
    io.realm.Realm r = getRealm();
    T f = r.where(clz()).findFirst();
    T res = map(f);
    org.newstand.datamigration.utils.Closer.closeQuietly(r);
    return res;
}