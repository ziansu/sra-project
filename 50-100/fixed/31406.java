@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        if (mWeightView.getText().toString().equals("0")) {
            mWeightView.setText("");
        }
        if (mVolumeView.isEnabled()) {
            mVolumeView.setText("");
        }
    }
}