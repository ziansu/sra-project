@java.lang.Override
public void onDeleteItemClicked(com.gmail.markdevw.wetube.adapters.PlaylistItemAdapter itemAdapter, com.gmail.markdevw.wetube.api.model.PlaylistItem playlistItem) {
    int index = com.gmail.markdevw.wetube.WeTubeApplication.getSharedDataSource().getPlaylist().indexOf(playlistItem);
    messageService.sendMessage(id, (("deleteitemplaylist" + (msgSplitter)) + (java.lang.String.valueOf(index))));
}