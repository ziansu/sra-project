@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
}