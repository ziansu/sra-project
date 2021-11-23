@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setHasOptionsMenu(true);
    mContext = getContext();
    android.os.Bundle bundle = getArguments();
    mCurrentScreen = bundle.getString(mihaljevic.miroslav.foundry.slimplayer.SlimListFragment.CURSOR_SCREEN_KEY);
    java.lang.String displayField = bundle.getString(mihaljevic.miroslav.foundry.slimplayer.SlimListFragment.DISPLAY_FIELD_KEY);
    mCursorAdapter = new mihaljevic.miroslav.foundry.slimplayer.SongCursorAdapter(getContext(), null, 0, displayField);
    setListAdapter(mCursorAdapter);
    getListView().setOnItemClickListener(this);
    getLoaderManager().initLoader(0, bundle, this);
}