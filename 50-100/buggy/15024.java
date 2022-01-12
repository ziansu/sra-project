private void useResultToSetTheUi(io.realm.RealmResults<pom.realmwithrxhava.Models.User> result) {
    if ((result.size()) > 0) {
        java.util.List<pom.realmwithrxhava.Models.User> userList = result.subList(0, result.size());
        adapter.setUserList(userList);
    }
}