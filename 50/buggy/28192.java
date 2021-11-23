@dagger.Provides
@javax.inject.Singleton
public com.jamessimshaw.cosplaycompanion.presenters.ModifyConventionPresenter provideModifyConventionPresenter(@javax.inject.Named(value = "conventions")
retrofit2.Retrofit retrofit) {
    return new com.jamessimshaw.cosplaycompanion.presenters.ModifyConventionPresenterImpl(retrofit);
}