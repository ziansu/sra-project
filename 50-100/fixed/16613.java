@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    mContext = getContext();
    préférences = this.mContext.getSharedPreferences(fichier_préférence, Context.MODE_PRIVATE);
    titre = mContext.getString(R.string.albums);
    setTri();
    reloadReceiver = new org.oucho.musicplayer.fragments.AlbumListFragment.ReloadView();
    android.content.IntentFilter filter = new android.content.IntentFilter("reload");
    mContext.registerReceiver(reloadReceiver, filter);
    isRegistered = true;
}