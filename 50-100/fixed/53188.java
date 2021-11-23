@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setHasOptionsMenu(true);
    mContext = getContext();
    getListView().setOnItemClickListener(this);
    android.os.Bundle bundle = getArguments();
    if (bundle != null) {
        mCurrentScreen = bundle.getString(mihaljevic.miroslav.foundry.slimplayer.SlimListFragment.CURSOR_SCREEN_KEY);
        mCursorAdapter = new mihaljevic.miroslav.foundry.slimplayer.SongCursorAdapter(getContext(), null, 0, bundle.getString(mihaljevic.miroslav.foundry.slimplayer.SlimListFragment.DISPLAY_FIELD_KEY));
        setListAdapter(mCursorAdapter);
        getLoaderManager().initLoader(0, bundle, this);
    }
}