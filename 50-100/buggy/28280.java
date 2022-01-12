@java.lang.Override
public void onPostExecute() {
    if ((mNowShootingMode) == (ThetaDevice.ShootingMode.LIVE_STREAMING)) {
        if ((mProgress) != null) {
            try {
                mProgress.dismiss();
                mProgress = null;
            } catch (java.lang.IllegalStateException e) {
                return ;
            }
        }
        org.deviceconnect.android.deviceplugin.theta.fragment.ThetaDialogFragment.showAlert(getActivity(), getString(R.string.theta_ssid_prefix), getString(R.string.theta_error_usb_live_streaming), new android.content.DialogInterface.OnClickListener() {
            @java.lang.Override
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                showReconnectionDialog();
            }
        });
    }else {
        loadThetaData();
    }
}