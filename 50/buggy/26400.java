@java.lang.Override
protected void onReset() {
    super.onReset();
    sideMenuPresenter.getView().addToApplicationPresenter();
    sideMenuPresenter.refreshList();
    getMatches(bIsEmployer);
}