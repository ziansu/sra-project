@java.lang.Override
public long getCurrentPosition() {
    boolean isAdDisplayed = adsProvider.isAdDisplayed();
    if (isAdDisplayed) {
        long adPosition = adsProvider.getCurrentPosition();
        return (com.kaltura.playkit.utils.Consts.MILLISECONDS_MULTIPLIER) * adPosition;
    }else {
        long contentCurrentPosition = super.getCurrentPosition();
        return contentCurrentPosition;
    }
}