@java.lang.Override
protected void done(@android.support.annotation.Nullable
java.util.ArrayList<pasta.streamer.data.PlaylistListData> result) {
    if ((spinner) != null)
        spinner.setVisibility(View.GONE);
    
    if (result == null) {
        pasta.onCriticalError(getActivity(), "category playlists action");
        return ;
    }
    adapter.swapData(result);
}