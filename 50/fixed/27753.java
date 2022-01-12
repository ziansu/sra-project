@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    myRgb[0] = isChecked;
    adjustBrightness();
}