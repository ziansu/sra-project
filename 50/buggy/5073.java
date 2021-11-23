@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    getDialog().getWindow().setSoftInputMode(((WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE) | (WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)));
    super.onViewCreated(view, savedInstanceState);
}