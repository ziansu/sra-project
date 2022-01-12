@org.greenrobot.eventbus.Subscribe
@java.lang.Override
public void onEvent(id.co.veritrans.sdk.coreflow.eventbus.events.NetworkUnavailableEvent event) {
    errorMessage = getString(R.string.no_network_msg);
    try {
        id.co.veritrans.sdk.uiflow.utilities.SdkUIFlowUtil.hideProgressDialog();
        id.co.veritrans.sdk.uiflow.utilities.SdkUIFlowUtil.showSnackbar(this, errorMessage);
    } catch (java.lang.NullPointerException ex) {
        id.co.veritrans.sdk.coreflow.core.Logger.e(("transaction error is " + (errorMessage)));
    }
}