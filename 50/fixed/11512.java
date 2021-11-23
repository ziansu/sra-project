@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.GONE);
        blockAndDisableAllButtons();
    }else {
        if ((mActions) != null) {
            mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.VISIBLE);
        }
    }
}