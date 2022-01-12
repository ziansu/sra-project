static com.android.internal.telephony.Phone getPhone(int phoneId) {
    android.util.Log.d(com.android.phone.PhoneGlobals.LOG_TAG, ("getPhone phoneId:" + phoneId));
    if ((phoneId >= 0) && (phoneId < (android.telephony.TelephonyManager.getDefault().getPhoneCount()))) {
        return com.android.phone.PhoneGlobals.getInstance().mPhones[phoneId];
    }else {
        return com.android.phone.PhoneGlobals.getPhone();
    }
}