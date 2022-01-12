@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        mPasswordView.removeTextChangedListener(this);
        mPasswordView.setText("");
        mPasswordView.addTextChangedListener(this);
        mPasswordView.setVisibility(View.GONE);
        mClientCertificateSpinner.setVisibility(View.VISIBLE);
    }else {
        mClientCertificateSpinner.setOnClientCertificateChangedListener(null);
        mClientCertificateSpinner.setAlias(null);
        mClientCertificateSpinner.setOnClientCertificateChangedListener(this);
        mPasswordView.setVisibility(View.VISIBLE);
        mClientCertificateSpinner.setVisibility(View.GONE);
    }
    validateFields();
}