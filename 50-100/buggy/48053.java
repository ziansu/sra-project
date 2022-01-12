@java.lang.Override
public void onLoadMore() {
    refreshType = LISTVIEW_LOAD_MORE;
    (nowPageIndex)++;
    if ((nowPageIndex) > (com.xiaoyu.rentingdemo.util.DataSource.getAllRoomListBean().getPageBean().getMaxPage())) {
        listViewPictures.stopLoadMore();
        listViewPictures.setNoDataLoad();
        com.xiaoyu.rentingdemo.util.ToastUtils.showToast("没有更多数据");
        return ;
    }
    listViewPictures.setHasNewDataLoad();
    getAllRoomListAction.getAllRoomList("shanghai", nowPageIndex, false);
}