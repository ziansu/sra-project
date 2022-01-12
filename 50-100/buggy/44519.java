@java.lang.Override
public void onResume() {
    super.onResume();
    dataCenter.setMsgHandler(msgHandler);
    if (((listCount) <= 0) || (dataCenter.getOfferWallAd().offerPageHasExpired())) {
        dataCenter.requestOfferWallFromWebsite(zoneId);
    }
}