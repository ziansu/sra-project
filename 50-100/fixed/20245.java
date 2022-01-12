@org.greenrobot.eventbus.Subscribe
public void onEvent(test.homework.nick.snp20.services.ListEvent listEvent) {
    android.util.Log.i(test.homework.nick.snp20.services.PlayerService.TAG, "listEvent  received");
    playlist = listEvent.getPlaylist();
    index = listEvent.getIndex();
    test.homework.nick.snp20.model.music_info_model.Info info = playlist.get(index);
    android.util.Log.i(test.homework.nick.snp20.services.PlayerService.TAG, (((info.getStream_url()) + "?client_id=") + (test.homework.nick.snp20.utils.Constants.USER_ID)));
    startPlayerWithPath(info.getStream_url());
}