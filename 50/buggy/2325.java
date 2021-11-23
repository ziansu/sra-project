@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    ru.molkov.collapsar.data.core.error.RetrofitException exception = ((ru.molkov.collapsar.data.core.error.RetrofitException) (throwable));
    timber.log.Timber.e(throwable, "There was an error loading image");
    mView.showError(exception.getMessage());
}