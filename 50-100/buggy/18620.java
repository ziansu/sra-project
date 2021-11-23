@java.lang.Override
public void onPlayListDeleted(com.example.user.cloudplayer.model.PlayList playList) {
    if (playList == null) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.on_playList_deleted), Toast.LENGTH_LONG).show();
    }else {
        int index = findPlayListByID(playList.getID());
        if (index != (-1)) {
            currentPlayLists.remove(index);
            adapter.updateListView(currentPlayLists);
        }
    }
}