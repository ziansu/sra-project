@java.lang.Override
public void endRequest() {
    super.endRequest();
    if ((com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPaginate()) != null) {
        com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPaginate().setHasMoreDataToLoad(com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPagePaginator().hasMorePages());
    }
}