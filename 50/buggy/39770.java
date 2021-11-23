@java.lang.Override
public void onDestroyView() {
    android.util.Log.d(ray.cyberpup.com.touchframework.InterceptsDialog.LOG_TAG, "destroy view");
    if (((getDialog()) != null) && (getRetainInstance()))
        getDialog().setDismissMessage(null);
    
    super.onDestroyView();
}