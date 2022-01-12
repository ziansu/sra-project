@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    timber.log.Timber.i(throwable, "There was an error loading image");
    ru.molkov.collapsar.data.core.error.RetrofitException exception = ((ru.molkov.collapsar.data.core.error.RetrofitException) (throwable));
    mView.showError(exception.getMessage());
}