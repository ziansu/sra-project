@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot.exists())
        emitter.onSuccess(dataSnapshot);
    
    emitter.onComplete();
}