@java.lang.Override
public void onPlayListDeleted(com.example.user.cloudplayer.model.PlayList playList) {
    if (playList == null) {
        sendToast(getResources().getString(R.string.on_playList_deleted));
    }
}