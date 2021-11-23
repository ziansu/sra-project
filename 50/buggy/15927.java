@java.lang.Override
public void onPlayListAdded(com.example.user.cloudplayer.model.PlayList playList) {
    if (playList == null) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.on_playList_added), Toast.LENGTH_LONG).show();
    }
}