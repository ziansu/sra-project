@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    android.util.Log.d("FB", snapshot.getValue().toString());
    allOffers = new java.util.ArrayList<com.logcats.fooddonation.Offer>();
    for (com.firebase.client.DataSnapshot offerSnapshot : snapshot.getChildren()) {
        com.logcats.fooddonation.Offer current = offerSnapshot.getValue(com.logcats.fooddonation.Offer.class);
        allOffers.add(current);
    }
    if ((mCallback) != null) {
        mCallback.onOffersReceived(allOffers);
    }
}