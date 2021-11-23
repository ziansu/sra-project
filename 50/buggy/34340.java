@java.lang.Override
public void registered() {
    if (isFailed) {
        progressDialog.dismiss();
        ch.hesso.master.sweetcity.utils.DialogUtils.show(context, "Service unavailable");
    }else {
        context.finish();
    }
}