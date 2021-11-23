@java.lang.Override
public void onSearchResultDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
    if (playLists == null) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.search_alert), Toast.LENGTH_LONG).show();
    }
}