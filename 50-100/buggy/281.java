@java.lang.Override
public void onBottom() {
    com.github.jdsjlzx.view.LoadingFooter.State state = com.github.jdsjlzx.util.RecyclerViewStateUtils.getFooterViewState(mRecyclerView);
    com.lzx.demo.util.TLog.error(("onBottom " + state));
    if (state == (LoadingFooter.State.Loading)) {
        android.util.Log.d(com.lzx.demo.ui.EndlessLinearLayoutActivity.TAG, "the state is Loading, just wait..");
        return ;
    }
    if ((com.lzx.demo.ui.EndlessLinearLayoutActivity.mCurrentCounter) < (com.lzx.demo.ui.EndlessLinearLayoutActivity.TOTAL_COUNTER)) {
        com.github.jdsjlzx.util.RecyclerViewStateUtils.setFooterViewState(this, mRecyclerView, com.lzx.demo.ui.EndlessLinearLayoutActivity.REQUEST_COUNT, LoadingFooter.State.Loading, null);
        requestData();
    }else {
        com.github.jdsjlzx.util.RecyclerViewStateUtils.setFooterViewState(this, mRecyclerView, com.lzx.demo.ui.EndlessLinearLayoutActivity.REQUEST_COUNT, LoadingFooter.State.TheEnd, null);
    }
}