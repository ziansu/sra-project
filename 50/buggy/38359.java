@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void onFocusChange(android.view.View view, boolean focused) {
    if ((mTrigger) == (net.xpece.material.floatinglabel.AbstractFloatingLabelView.Trigger.FOCUS)) {
        onOwnerViewFocusChanged(focused);
    }
}