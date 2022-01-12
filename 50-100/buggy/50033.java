@java.lang.Override
public void execute(io.realm.Realm realm) {
    io.realm.RealmList<ch.rmy.android.http_shortcuts.realm.models.Category> categories = getBase().getCategories();
    ch.rmy.android.http_shortcuts.realm.models.Category category = realm.copyToRealm(ch.rmy.android.http_shortcuts.realm.models.Category.createNew(name));
    category.setId(generateId(ch.rmy.android.http_shortcuts.realm.models.Category.class));
    categories.add(category);
}