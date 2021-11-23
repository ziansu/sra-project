@java.lang.Override
public void onDestroyView() {
    updateQuestion();
    super.onDestroyView();
    unbinder.unbind();
}