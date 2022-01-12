private void delete(@android.support.annotation.NonNull
final emreaktrk.edgecontact.ui.edge.contact.Contact contact) {
    io.realm.Realm.getDefaultInstance().executeTransaction(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            contact.deleteFromRealm();
        }
    });
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.N_MR1)) {
        android.content.pm.ShortcutManager manager = getSystemService(android.content.pm.ShortcutManager.class);
        manager.removeDynamicShortcuts(java.util.Collections.singletonList(contact.getId()));
    }
    emreaktrk.edgecontact.logger.Logger.i("Deleted contact");
}