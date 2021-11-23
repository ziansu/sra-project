@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    myRgb[2] = isChecked;
    adjustBrightness();
}