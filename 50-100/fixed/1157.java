@java.lang.Override
public void onClick(android.view.View arg0) {
    if (((articleAdType) == (com.novel.reader.util.Setting.InterstitialAd)) && ((com.novel.reader.util.Setting.getSettingInt(Setting.keyYearSubscription, this)) == 0)) {
        requestInterstitialAd();
        adHasShowed = false;
    }
    previousPage();
}