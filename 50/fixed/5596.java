@java.lang.Override
public void onNext(com.jyutwaa.zhaoziliang.glimpse.Model.Bilibili.TopListType topListType) {
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.updateList(topListType);
}