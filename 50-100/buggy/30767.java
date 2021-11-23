private void submitCode() {
    java.lang.String inviteCode = inviteCodeText.getText().toString();
    if ((inviteCode.length()) > 0) {
        if (org.cm.podd.report.util.RequestDataUtil.hasNetworkConnection(this)) {
            new org.cm.podd.report.activity.RegistrationActivity.InviteCodeTask().execute(((java.lang.Void[]) (null)));
        }else {
        }
    }else {
        de.keyboardsurfer.android.widget.crouton.Crouton.makeText(this, getString(R.string.form_data_require_error), Style.ALERT, R.id.errorArea).show();
        return ;
    }
}