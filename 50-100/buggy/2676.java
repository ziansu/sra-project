@java.lang.Override
protected void init(com.lam.musicplayer.songPlayer.SongPlayPresenter mPresenter, android.os.Bundle savedInstanceState) {
    de.greenrobot.event.EventBus.getDefault().register(this);
    butterknife.ButterKnife.inject(this);
    mSongPlayer = getIntent().getParcelableExtra(com.lam.musicplayer.songPlayer.SongPlayActivity.EXTRA_SONG_PLAYER);
    mPlayMode = com.lam.musicplayer.songPlayer.SongPlayActivity.MODE_RECYCLER_LIST;
    mPresenter.loadPlaySongList(mSongPlayerList, mSongPlayer);
    initView();
    registerListener();
    timeManager();
    mPresenter.loadSongCover(mSongPlayer.getPicSmall());
}