@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
    if (arg1 == true) {
        int k = (arg0.getId()) % 100;
        mCheckedIndex[k] = 1;
    }
}