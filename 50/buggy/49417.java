@java.lang.Override
protected void setUp() {
    super.setUp();
    initData();
    initAppBarLayout();
    initVideoView();
    requestVideoDetailData(((videoSimpleInfoBean) == null ? "" : videoSimpleInfoBean.dataId));
}