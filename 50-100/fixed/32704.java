@java.lang.Override
protected void onSuccess(org.edx.mobile.model.api.Mx_SendOTPResponse mx_sendOTPResponse) throws java.lang.Exception {
    super.onSuccess(mx_sendOTPResponse);
    if (mx_sendOTPResponse.mobile_number().equals(sign_Up_Mobile_Number)) {
        android.os.Bundle args = new android.os.Bundle();
        java.lang.String[] mParam = new java.lang.String[]{ sign_Up_Mobile_Number , sign_Up_Password };
        org.edx.mobile.VerifyOTP_Fragment mFrag = new org.edx.mobile.VerifyOTP_Fragment();
        args.putStringArray("auth_keys", mParam);
        mFrag.setArguments(args);
        rHelper.replaceFragment(R.id.mx_sign_up_fragment, mFrag, getFragmentManager());
    }
}