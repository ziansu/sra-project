public void InitializeRealm() {
    io.realm.RealmConfiguration config = new io.realm.RealmConfiguration.Builder(mContext).name(mContext.getString(R.string.realm_name)).build();
    mRealm = io.realm.Realm.getInstance(config);
}