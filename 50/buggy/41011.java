@java.lang.Override
public void endRequest() {
    super.endRequest();
    com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPaginate().setHasMoreDataToLoad(com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPagePaginator().hasMorePages());
}