public void removeFromPagesToTrack(com.example.jose.updated.model.Page page) {
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    com.example.jose.updated.model.Page pageToDelete = getPage(page);
    realm.beginTransaction();
    pageToDelete.deleteFromRealm();
    realm.commitTransaction();
    realm.close();
    if ((com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser()) != null) {
        updateFirebaseContents();
    }
}