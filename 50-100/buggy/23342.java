@java.lang.Override
protected void initVariables() {
    setHasOptionsMenu(true);
    android.support.v4.app.FragmentActivity activity = getActivity();
    if (activity instanceof com.quovantis.music.interfaces.IOnSettingsClickListener) {
        mSettingClickListener = ((com.quovantis.music.interfaces.IOnSettingsClickListener) (activity));
    }
    mListener = ((com.quovantis.music.module.allsongs.AllSongsFragment.IGetSongsListener) (activity));
    showProgress();
    mSongsList = new java.util.ArrayList<>();
    mAdapter = new com.quovantis.music.module.allsongs.SongsAdapter(mSongsList, activity, this);
    mSongsRV.setAdapter(mAdapter);
    mListener.getSongs();
}