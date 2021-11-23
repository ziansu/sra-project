@java.lang.Override
public long getCurrentPosition() {
    boolean isAdDisplayed = adsProvider.isAdDisplayed();
    com.kaltura.playkit.ads.AdEnabledPlayerController.log.d(("getCurrentPosition isAdDisplayed = " + isAdDisplayed));
    if (isAdDisplayed) {
        long adPosition = adsProvider.getCurrentPosition();
        com.kaltura.playkit.ads.AdEnabledPlayerController.log.d(("getCurrentPosition = " + adPosition));
        return (com.kaltura.playkit.utils.Consts.MILLISECONDS_MULTIPLIER) * adPosition;
    }else {
        long contentCurrentPosition = super.getCurrentPosition();
        com.kaltura.playkit.ads.AdEnabledPlayerController.log.d(("contnent getCurrentPosition: " + contentCurrentPosition));
        return contentCurrentPosition;
    }
}