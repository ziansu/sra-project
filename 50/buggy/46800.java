@java.lang.Override
protected void initActionBar() {
    rootPresenter.newBarBuilder().setToolbarVisible(true).setTitleRes(R.string.setting_title).setHomeState(BarBuilder.HOME_ARROW).setStatusBarVisible(false).build();
}