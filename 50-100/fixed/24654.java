@java.lang.Override
public void onClick(android.view.View v) {
    if ((mEncoder) != null) {
        if (btnSwitchEncoder.getText().toString().contentEquals("soft enc")) {
            mEncoder.swithToSoftEncoder();
            btnSwitchEncoder.setText("hard enc");
        }else
            if (btnSwitchEncoder.getText().toString().contentEquals("hard enc")) {
                mEncoder.swithToHardEncoder();
                btnSwitchEncoder.setText("soft enc");
            }
        
    }
}