@java.lang.Override
public void onRewardedVideoAdLoaded() {
    _adapter.logD("RewardedAdListener: onRewardedVideoAdLoaded: begin.");
    _adapter._isRewardedVideoAdLoading.set(false);
    refreshAdAvailability();
    org.cocos2dx.plugin.AdsWrapper.onAdsResult(_adapter, AdsWrapper.RESULT_CODE_VideoReceived, "Reward based video ad is received/loaded.");
    _adapter.logD("RewardedAdListener: onRewardedVideoAdLoaded: end.");
}