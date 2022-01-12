@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.dailynews.dailynews.sync.DailyNewsSyncAdapter.syncImmediately(getActivity(), com.dailynews.dailynews.sync.DailyNewsSyncAdapter.syncBundle(new java.lang.String[]{ mTopic }));
    getActivity().getSupportLoaderManager().initLoader(mPosition, null, this);
}