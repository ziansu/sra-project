private void initializeComponents() {
    this.mVwoLocalData = new com.vwo.mobile.data.VwoLocalData(this);
    this.mVwoUtils = new com.vwo.mobile.utils.VwoUtils(this);
    this.mVwoDownloader = new com.vwo.mobile.network.VwoDownloader(this);
    this.mVwoUrlBuilder = new com.vwo.mobile.utils.VwoUrlBuilder(this);
    this.mVwoData = new com.vwo.mobile.data.VwoData(this, null);
    this.mVwoSocket = new com.vwo.mobile.VwoSocket(this);
    this.mVwoPreference = new com.vwo.mobile.utils.VwoPreference(this);
}