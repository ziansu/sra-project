@javax.annotation.Nullable
public rx.Observable<? extends rx.Observable<com.alangpierce.lambdacalculusplayground.drag.PointerMotionEvent>> getBodyObservable() {
    if ((bodyView) == null) {
        return null;
    }
    return dragObservableGenerator.getDragObservable(bodyView.getNativeView());
}