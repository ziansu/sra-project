@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.exists()) && ((counter.decrementAndGet()) == 0)) {
        addUid(uid, mUid, reference);
    }else {
        android.widget.Toast.makeText(this, R.string.error_invalid_uid, Toast.LENGTH_SHORT).show();
    }
}