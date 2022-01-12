@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (((null != dataSnapshot) && (dataSnapshot.hasChild(user_id))) && ((!(dataSnapshot.child(user_id).hasChild("name"))) || (!(dataSnapshot.child(user_id).hasChild("image"))))) {
        android.content.Intent setupIntent = new android.content.Intent(this, ru.solandme.simpleblog.SetupActivity.class);
        setupIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(setupIntent);
    }
}