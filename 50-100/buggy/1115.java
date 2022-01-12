@java.lang.Override
public void updateGasMode() {
    final int gasMode = mThingySdkManager.getGasMode(mDevice);
    if (gasMode == 1) {
        mGasModeSummary.setText(R.string.gas_mode_one);
    }else
        if (gasMode == 2) {
            mGasModeSummary.setText(R.string.gas_mode_two);
        }else
            if (gasMode == 3) {
                mGasModeSummary.setText(R.string.gas_mode_three);
            }
        
    
}