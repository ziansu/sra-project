private void sendBroadcast(java.lang.String message) {
    if (((message == (com.bry.adcafe.adapters.AdvertCard.START_TIMER)) && ((com.bry.adcafe.adapters.AdvertCard.mLastOrNotLast) == (com.bry.adcafe.Constants.NOT_LAST))) && (com.bry.adcafe.adapters.AdvertCard.hasAdLoaded)) {
        android.util.Log.d("AdvertCard - ", "Sending message to start timer");
        android.content.Intent intent = new android.content.Intent(com.bry.adcafe.Constants.ADVERT_CARD_BROADCAST_TO_START_TIMER);
        mSwipeView.lockViews();
        com.bry.adcafe.adapters.AdvertCard.clickable = false;
        android.support.v4.content.LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);
    }
}