@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if (null != (view)) {
        ((android.view.ViewGroup) (view.getParent())).removeView(view);
    }
}