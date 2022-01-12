@java.lang.Override
void onError(java.lang.Throwable e) {
    if (isViewAttached()) {
        getView().onError(e.toString());
    }
}