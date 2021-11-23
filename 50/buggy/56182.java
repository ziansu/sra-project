protected void resumeRealm() {
    if (((myRealm) == null) || (myRealm.isClosed())) {
        myRealm = io.realm.Realm.getDefaultInstance();
        android.util.Log.d(com.zhan.budget.Fragment.BaseRealmFragment.TAG, "----- RESUME REALM -----");
    }
}