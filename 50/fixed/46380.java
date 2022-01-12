@java.lang.Override
public void onDestroyView() {
    if ((viewUnbinder) != null) {
        viewUnbinder.unbind();
    }
    super.onDestroyView();
}