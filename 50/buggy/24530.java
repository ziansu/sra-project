@java.lang.Override
public int getCalculatedPreferredNetworkType() {
    enforceReadPermission();
    return com.android.internal.telephony.PhoneFactory.calculatePreferredNetworkType(mPhone.getContext());
}