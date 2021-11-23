@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public static <F extends io.netty.util.concurrent.Future, R> rx.functions.Func1<F, rx.Observable<? extends R>> checkFuture() {
    return ((rx.functions.Func1) (org.jocean.http.util.RxNettys.CHECK_FUTURE));
}