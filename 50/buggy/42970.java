public int getItemCount() {
    if ((getRealmAdapter()) != null) {
        int size = getRealmAdapter().getCount();
        android.util.Log.e("Note Adapter: ", ("Realm adapter size : " + size));
        return size;
    }
    return 0;
}