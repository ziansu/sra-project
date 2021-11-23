@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onAttach(android.app.Activity activity) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) {
        dagger.android.AndroidInjection.inject(this);
        super.onAttach(activity);
    }
}