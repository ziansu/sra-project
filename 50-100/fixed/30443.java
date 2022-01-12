@org.testng.annotations.Test(groups = { "AdsVuapResolvedState" }, dataProviderClass = com.wikia.webdriver.common.dataprovider.ads.AdsDataProvider.class, dataProvider = "adsVuapResolvedState")
public void vuapResolvedShouldEnd(com.wikia.webdriver.common.core.url.Page page, java.lang.String slot) {
    final com.wikia.webdriver.pageobjectsfactory.pageobject.adsbase.AdsBaseObject ads = openPageWithVideoInLocalStorage(page);
    final com.wikia.webdriver.pageobjectsfactory.componentobject.ad.AutoplayVuap vuap = new com.wikia.webdriver.pageobjectsfactory.componentobject.ad.AutoplayVuap(driver, slot, findFirstIframeWithAd(slot), false);
    scrollToSlot(slot, ads);
    vuap.replay();
    com.wikia.webdriver.pageobjectsfactory.componentobject.ad.VuapAssertions.verifyReplyButtonDisplayedAfterVideoEnds(vuap, com.wikia.webdriver.testcases.adstests.TestAdsVuapOasis.MAX_AUTOPLAY_MOVIE_DURATION);
}