@java.lang.Override
public void call(final java.lang.Integer pin) {
    progressDialog.dismiss();
    if (pin > 0) {
        cgeo.geocaching.ui.dialog.Dialogs.message(activity, R.string.init_sendToCgeo, activity.getString(R.string.init_sendToCgeo_register_ok).replace("####", java.lang.String.valueOf(pin)));
    }else {
        cgeo.geocaching.ui.dialog.Dialogs.message(activity, R.string.init_sendToCgeo, R.string.init_sendToCgeo_register_fail);
    }
}