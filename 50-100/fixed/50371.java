@java.lang.Override
public void onRewardedVideoAdFailedToLoad(int errorCode) {
    _adapter.logD(("RewardedAdListener: onRewardedVideoAdFailedToLoad: begin errorCode = " + errorCode));
    _adapter._isRewardedVideoAdLoading = false;
    refreshAdAvailability();
    org.cocos2dx.plugin.AdsWrapper.onAdsResult(_adapter, AdsWrapper.RESULT_CODE_VideoUnknownError, ("Rewarded based video ad is failed to receive/load with error: " + errorCode));
    _adapter.logE("RewardedAdListener: onRewardedVideoAdFailedToLoad: end.");
}