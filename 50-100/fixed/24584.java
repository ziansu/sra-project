public void getAllViews() {
    songList = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.songList)));
    songList.setHasFixedSize(true);
    android.support.v7.widget.LinearLayoutManager linearLayout = new android.support.v7.widget.LinearLayoutManager(getActivity(), android.support.v7.widget.LinearLayoutManager.VERTICAL, false);
    songList.setLayoutManager(linearLayout);
    getSongList();
    if (!(cybrilla.musicplayer.util.MusicPlayerHelper.getInstance().getMusicStartedOnce())) {
        cybrilla.musicplayer.util.SlidingPanel.getInstance().setSongToLastPlayed();
    }else {
        cybrilla.musicplayer.util.SlidingPanel.getInstance().setPlayerControl();
    }
}