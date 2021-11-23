@java.lang.Override
public void onClick(android.view.View v) {
    if ((mInKbMode) && (isTypedTimeFullyLegal())) {
        finishKbMode(false);
    }else {
        tryVibrate();
    }
    notifyOnDateListener();
    dismiss();
}