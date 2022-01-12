public java.util.List<java.lang.String> getMatchingImsis(com.android.server.wifi.IMSIParameter mccMnc) {
    if (mccMnc == null) {
        return null;
    }
    java.util.List<java.lang.String> imsis = new java.util.ArrayList<>();
    for (int subId : mSubscriptionManager.getActiveSubscriptionIdList()) {
        java.lang.String imsi = mTelephonyManager.getSubscriberId(subId);
        if (mccMnc.matches(imsi)) {
            imsis.add(imsi);
        }
    }
    return imsis.isEmpty() ? null : imsis;
}