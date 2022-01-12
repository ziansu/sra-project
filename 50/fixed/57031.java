@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        mAdbUtil.openAirDebug();
    }else {
        mAdbUtil.closeAirDebug();
    }
}