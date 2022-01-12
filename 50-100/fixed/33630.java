@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mListener = ((ray.cyberpup.com.touchframework.InterceptsDialog.InterceptsDialogListener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement InterceptsDialogListener"));
    }
}