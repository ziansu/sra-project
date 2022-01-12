@java.lang.Override
public void didLoadAd(tv.superawesome.sdk.data.Models.SAAd ad) {
    vad = new tv.superawesome.sdk.views.SAVideoActivity(this);
    vad.setAd(ad);
    vad.setIsParentalGateEnabled(true);
    vad.setShouldAutomaticallyCloseAtEnd(false);
    vad.setShouldShowCloseButton(true);
    vad.setAdListener(adListener);
    vad.setVideoAdListener(videoAdListener);
    vad.setParentalGateListener(parentalGateListener);
    vad.play();
}