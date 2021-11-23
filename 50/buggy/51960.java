@java.lang.Override
public void updateThingeeName() {
    mNameSummary.setText(mThingySdkManager.getDeviceName(mDevice));
}