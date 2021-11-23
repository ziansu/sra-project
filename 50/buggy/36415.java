@android.support.annotation.Nullable
public Model findFirst() {
    return realmQuery.findAll().first(null);
}