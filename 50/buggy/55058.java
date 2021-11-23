public java.lang.String getMacAddress() {
    return com.oinux.android.ConfigLoader.getInstance(true).get(Config.MAC_ADDRESS, mMacAddress);
}