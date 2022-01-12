private java.lang.String buildProvisioningAddress() {
    java.lang.String mnc = java.lang.String.format("%03d", mRcsSettings.getMobileNetworkCode());
    java.lang.String mcc = java.lang.String.format("%03d", mRcsSettings.getMobileCountryCode());
    return ((("config.rcs.mnc" + mnc) + ".mcc") + mcc) + ".pub.3gppnetwork.org";
}