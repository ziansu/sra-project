public void onChildAdded(com.google.firebase.database.DataSnapshot snapshot, java.lang.String previousChildKey) {
    if ((!(com.csmdstudios.payapp.FirebaseSearchArray.contains(mSnapshots, snapshot.getKey()))) && (!(mUser.getUid().equals(snapshot.getKey())))) {
        if ((mLoadingIndicator) != null) {
            mLoadingIndicator.setVisibility(View.GONE);
        }
        mSnapshots.add(index, snapshot);
        (index)++;
        notifyChangedListeners(com.csmdstudios.payapp.FirebaseSearchArray.OnChangedListener.EventType.Added, index);
    }
}