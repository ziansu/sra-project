private void attemptVerify() {
    mPhoneView.setError(null);
    java.lang.String phoneNumber = mPhoneView.getText().toString();
    if ((phoneNumber.length()) != 10) {
        mPhoneView.setError("Invalid Phone number");
        return ;
    }else {
        showProgress(true);
        in.yousee.theadmin.SessionHandler sessionHandler = new in.yousee.theadmin.SessionHandler(this);
        try {
            sessionHandler.verifyExec(phoneNumber, this);
        } catch (in.yousee.theadmin.model.CustomException e) {
            in.yousee.theadmin.util.LogUtil.print(e.getErrorMsg());
        }
    }
}