@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (done) {
        io.reactivex.plugins.RxJavaPlugins.onError(e);
        return ;
    }
    done = true;
    error = e;
    drain();
}