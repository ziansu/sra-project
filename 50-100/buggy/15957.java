void onCreateImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.NonNull
android.content.Context context) {
    if (!(v.isInEditMode())) {
        allowScreenViewCalls = true;
        v.onCreate(context);
        allowScreenViewCalls = false;
        VP presenter = getPresenter(v);
        if (presenter != null)
            presenter.onCreate(v);
        
    }
}