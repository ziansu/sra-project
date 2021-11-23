@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (context instanceof android.app.Activity) {
            doAttach(((android.app.Activity) (context)));
        }
    }
}