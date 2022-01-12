private void showAlert(java.lang.String message, final boolean doDelete) {
    if ((nu.yona.app.ui.YonaActivity.getActivity()) != null) {
        nu.yona.app.ui.YonaActivity.getActivity().showLoadingView(false, null);
        android.support.design.widget.Snackbar.make(nu.yona.app.ui.YonaActivity.getActivity().findViewById(android.R.id.content), message, Snackbar.LENGTH_INDEFINITE).setAction(getString(R.string.ok), new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                if (doDelete) {
                    doDeleteDeviceRequest();
                }
            }
        }).show();
    }
}