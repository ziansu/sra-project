@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
    int k = (arg0.getId()) % 100;
    if (arg1 == true) {
        mCheckedIndex[k] = 1;
    }else {
        mCheckedIndex[k] = 0;
    }
}