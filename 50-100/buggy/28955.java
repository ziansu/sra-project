@java.lang.Override
public void onRefresh() {
    if (com.crazyhitty.chdev.ks.munch.utils.NetworkConnectionUtil.isNetworkAvailable(getActivity())) {
        if (mSource.equals("all_sources")) {
            mFeedsPresenter.attemptFeedLoading();
        }else {
            android.widget.Toast.makeText(getActivity(), "not working", Toast.LENGTH_SHORT).show();
            mFeedsPresenter.attemptFeedLoading(mSource);
        }
    }else {
        swipeRefreshLayout.setRefreshing(false);
        com.crazyhitty.chdev.ks.munch.utils.NetworkConnectionUtil.showNoNetworkDialog(getActivity());
    }
}