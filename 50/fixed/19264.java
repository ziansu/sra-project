@java.lang.Override
@android.support.annotation.CallSuper
public void attachView(@android.support.annotation.NonNull
V view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    mView = view;
    restoreInstanceState(savedInstanceState);
    addObservables();
}