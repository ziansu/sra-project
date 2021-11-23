@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        mPasswordView.setVisibility(View.GONE);
        mClientCertificateSpinner.setVisibility(View.VISIBLE);
    }else {
        mPasswordView.setVisibility(View.VISIBLE);
        mClientCertificateSpinner.setVisibility(View.GONE);
    }
    validateFields();
}