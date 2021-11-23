public void InitializeRealm(android.content.Context context) {
    mContext = context;
    io.realm.RealmConfiguration config = new io.realm.RealmConfiguration.Builder(context).name(context.getString(R.string.realm_name)).build();
    mRealm = io.realm.Realm.getInstance(config);
}