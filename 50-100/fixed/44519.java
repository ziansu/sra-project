@java.lang.Override
public void onResume() {
    super.onResume();
    dataCenter.setMsgHandler(msgHandler);
    if (((listCount) <= 0) || (dataCenter.getOfferWallAd().offerPageHasExpired())) {
        listCount = 0;
        dataCenter.requestOfferWallFromWebsite(zoneId);
    }
}