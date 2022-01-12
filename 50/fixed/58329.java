@java.lang.Override
public void isLoadingMore(boolean loading) {
    if (loading) {
        loadState = STATE_LOADING;
        com.lovejjfg.zhifou.ui.recycleview.RefreshRecycleAdapter.notifyItemChanged(getItemCount());
    }
}