private io.realm.RealmResults<com.example.studentslist.realm.data.User> searchUser(java.lang.String name) {
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    io.realm.RealmResults<com.example.studentslist.realm.data.User> searchUsers = realm.where(com.example.studentslist.realm.data.User.class).contains("searchName", name.toLowerCase()).findAllSorted("searchName", Sort.ASCENDING);
    realm.close();
    return searchUsers;
}