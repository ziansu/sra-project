@android.support.annotation.CallSuper
protected void onStop(@android.support.annotation.NonNull
final android.view.View view, @android.support.annotation.NonNull
final TActivity activity) {
    if (appeared) {
        onDisappear(view, activity);
        appeared = false;
    }
}