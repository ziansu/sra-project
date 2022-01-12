@java.lang.Override
public void onError(java.lang.String message) {
    if ((getActivity()) != null) {
        updateText(root, R.id.init_res, getString(R.string.failed));
    }
}