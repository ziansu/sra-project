@java.lang.Override
public void onDataChange(com.totvs.pcsistemas.pocbeacons.pocbeacons.DataSnapshot snapshot) {
    try {
        ShowOffer(snapshot.child("OfferSponsor").getValue().toString(), snapshot.child("OfferPictureSponsor").getValue().toString(), snapshot.child("Offer").getValue().toString(), snapshot.child("OfferPicture").getValue().toString());
    } catch (java.lang.Exception e) {
    }
}