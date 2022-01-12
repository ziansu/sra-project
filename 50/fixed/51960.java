@java.lang.Override
public void updateThingeeName() {
    final java.lang.String name = mThingySdkManager.getDeviceName(mDevice);
    if (name != null) {
        mNameSummary.setText(name);
    }
}