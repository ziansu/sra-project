@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError == null) {
        android.util.Log.d(com.flatshare.domain.interactors.matchingoverview.impl.MatchingOverviewInteractorImpl.TAG, ("onComplete: Sandro" + path));
        notifySuccess();
    }else {
        notifyError(databaseError.getMessage());
    }
}