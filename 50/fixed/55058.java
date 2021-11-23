public java.lang.String getMacAddress() {
    return com.oinux.android.ConfigLoader.getInstance().get(Config.MAC_ADDRESS, mMacAddress);
}