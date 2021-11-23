void onCreateImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.NonNull
android.content.Context context) {
    if (!(v.isInEditMode())) {
        VP presenter = getPresenter(v, true);
        allowScreenViewCalls = true;
        v.onCreate(context);
        allowScreenViewCalls = false;
        if (presenter != null)
            presenter.onCreate(v);
        
    }
}