@java.lang.Override
public void connectServerFail() {
    progressBar.setVisibility(View.GONE);
    if ((getActivity()) != null) {
        com.hbbsolution.owner.utils.ShowAlertDialog.showAlert(getResources().getString(R.string.connection_error), getActivity());
    }
}