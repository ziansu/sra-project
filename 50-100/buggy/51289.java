@java.lang.Override
public void onConnected(org.deviceconnect.android.deviceplugin.theta.core.ThetaDevice device) {
    if ((mDialog) != null) {
        mDialog.dismiss();
        mDialog = null;
    }
    android.app.Activity activity = getActivity();
    if (activity != null) {
        activity.runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mServiceIdView.setText(getThetaName());
            }
        });
    }
}