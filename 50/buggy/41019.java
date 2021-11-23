@dagger.Provides
@sinolight.cn.qgapp.dagger.PerActivity
sinolight.cn.qgapp.presenter.SearchActivityPresenter provideSearchActivityPresenter(android.content.Context context, sinolight.cn.qgapp.views.view.ISearchActivityView view, sinolight.cn.qgapp.data.db.DaoSession daoSession) {
    return new sinolight.cn.qgapp.presenter.SearchActivityPresenter(context, view, daoSession);
}