@java.lang.Override
public void setData(java.util.List<cn.winxo.gank.entity.remote.GankData> gankDatas, boolean isLoadMore) {
    if (isLoadMore) {
        cn.winxo.gank.module.main.MainActivity.mPage += 1;
        showList.addAll(gankDatas);
    }else {
        cn.winxo.gank.module.main.MainActivity.mPage = 1;
        showList.clear();
        showList.addAll(gankDatas);
    }
    mTypeAdapter.setItems(showList);
    mTypeAdapter.notifyDataSetChanged();
    hideLoading();
}