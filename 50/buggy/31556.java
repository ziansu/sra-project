@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    super.onScrollStateChanged(recyclerView, newState);
    android.util.Log.d(com.ray.rssmovie.widget.EasyListingView.TAG, ("EasyListingView scroll stated:" + newState));
}