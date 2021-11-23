private java.lang.String buildProvisioningAddress() {
    java.lang.String mnc = java.lang.String.format("%03d", mRcsSettings.getMobileNetworkCode());
    java.lang.String mcc = java.lang.String.format("%03d", mRcsSettings.getMobileCountryCode());
    return new java.lang.StringBuilder("config.rcs.mnc").append(mnc).append(".mcc").append(mcc).append(".pub.3gppnetwork.org").toString();
}