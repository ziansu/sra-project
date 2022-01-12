@java.lang.Override
public void onClick(android.view.View v) {
    if ((mEncoder) != null) {
        if (btnSwitchEncoder.getText().toString().contentEquals("soft enc")) {
            mEncoder.swithToHardEncoder();
            btnSwitchEncoder.setText("hard enc");
        }else
            if (btnSwitchEncoder.getText().toString().contentEquals("hard enc")) {
                mEncoder.swithToSoftEncoder();
                btnSwitchEncoder.setText("soft enc");
            }
        
    }
}