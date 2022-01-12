private void setEditable(java.lang.Boolean flag) {
    android.util.Log.d(rkr.binatestation.pathrakkaran.modules.profile.UserProfileActivity.TAG, (("setEditable() called with: flag = [" + flag) + "]"));
    mNameEditText.setFocusable(flag);
    mNameEditText.setFocusableInTouchMode(flag);
    mPhoneNumberEditText.setFocusable(false);
    mPhoneNumberEditText.setFocusableInTouchMode(false);
    mEmailEditText.setFocusable(flag);
    mEmailEditText.setFocusableInTouchMode(flag);
    mAddressEditText.setClickable(flag);
    mAddressEditText.setFocusableInTouchMode(flag);
    mPostcodeEditText.setClickable(flag);
    mPostcodeEditText.setFocusableInTouchMode(flag);
}