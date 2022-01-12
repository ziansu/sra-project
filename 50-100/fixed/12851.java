@java.lang.Override
public void onSuccess() {
    android.app.Fragment f = getFragmentManager().findFragmentByTag("Video");
    com.gmail.markdevw.wetube.fragments.VideoListFragment vlf = ((com.gmail.markdevw.wetube.fragments.VideoListFragment) (f));
    vlf.getVideoItemAdapter().notifyDataSetChanged();
    vlf.getRecyclerView().scrollToPosition(0);
}