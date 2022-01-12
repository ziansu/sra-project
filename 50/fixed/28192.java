@dagger.Provides
@javax.inject.Singleton
public com.jamessimshaw.cosplaycompanion.presenters.ModifyConventionPresenter provideModifyConventionPresenter() {
    return new com.jamessimshaw.cosplaycompanion.presenters.ModifyConventionPresenterImpl();
}