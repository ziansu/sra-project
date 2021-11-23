@java.lang.Override
public void onNext(java.util.List<com.glooory.petal.mvp.model.entity.PinBean> pinBeen) {
    if ((pinBeen.size()) == 0) {
        mRootView.showNoMoreDataFooter(true);
        return ;
    }
    (mPage)++;
    mAdapter.setNewData(pinBeen);
    mRootView.showNoMoreDataFooter(((pinBeen.size()) < 10));
}