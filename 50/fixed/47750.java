@java.lang.Override
public void onSubscribe(io.reactivex.disposables.Disposable s) {
    io.reactivex.internal.operators.observable.DisposableHelper.setOnce(this, s);
}