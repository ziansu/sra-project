@java.lang.Override
public void onTimeout() {
    if ((getActivity()) != null) {
        updateText(root, R.id.init_res, getString(R.string.timeout));
    }
}