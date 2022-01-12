@java.lang.Override
public void callback() {
    if (progress != null) {
        progress.dismiss();
    }
    if ((getActivity()) != null) {
        getActivity().finish();
    }
}