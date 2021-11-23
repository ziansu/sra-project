@java.lang.Override
public void onLoadNextPage(android.view.View view) {
    super.onLoadNextPage(view);
    com.lnyp.recyclerview.RecyclerViewLoadingFooter.State state = com.lnyp.recyclerview.RecyclerViewStateUtils.getFooterViewState(listJuzi);
    if (state == (RecyclerViewLoadingFooter.State.Loading)) {
        return ;
    }
    if (mHasMore) {
        com.lnyp.recyclerview.RecyclerViewStateUtils.setFooterViewState(getActivity(), listJuzi, mHasMore, RecyclerViewLoadingFooter.State.Loading, null);
        qryMeijus();
    }else {
        com.lnyp.recyclerview.RecyclerViewStateUtils.setFooterViewState(getActivity(), listJuzi, mHasMore, RecyclerViewLoadingFooter.State.TheEnd, null);
    }
}