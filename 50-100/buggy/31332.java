@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    activity.setTitle(R.string.details);
    setHasOptionsMenu(true);
    mAdapter = new org.dvbviewer.controller.ui.adapter.VideoAdapter(this);
    dirId = getArguments().getLong(org.dvbviewer.controller.ui.fragments.VideoList.KEY_DIR_ID, 0);
}