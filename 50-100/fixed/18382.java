@java.lang.Override
public rx.Observable<android.view.View> call(java.lang.Integer i) {
    android.view.View view = vp.getChildAt(i);
    if (view instanceof android.view.ViewGroup) {
        rx.Observable<android.view.View> childView = findView(view);
        return rx.Observable.just(view).concatWith(childView);
    }else {
        return rx.Observable.just(view);
    }
}