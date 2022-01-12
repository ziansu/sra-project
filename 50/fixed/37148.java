public void loadMore(int from, com.jing.app.jjgallery.gdb.view.home.IHomeView homeView) {
    com.jing.app.jjgallery.gdb.presenter.GdbGuidePresenter.LoadMoreTask task = new com.jing.app.jjgallery.gdb.presenter.GdbGuidePresenter.LoadMoreTask(homeView);
    addToTask(task, from);
}