@java.lang.Override
public void onSubscribe(@io.reactivex.annotations.NonNull
io.reactivex.disposables.Disposable d) {
    view.showLoadingIndicator();
    disposable.add(d);
}