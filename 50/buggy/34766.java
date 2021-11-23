@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
}