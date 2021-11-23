@java.lang.Override
public void onPlayListDeleted(com.example.user.cloudplayer.model.PlayList playList) {
    if (playList != null) {
        int index = findPlayListByID(playList.getID());
        if (index != (-1)) {
            currentPlayLists.remove(index);
            adapter.updateListView(currentPlayLists);
        }
    }
}