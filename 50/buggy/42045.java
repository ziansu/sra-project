@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    android.content.Intent intent = new android.content.Intent(this, com.app.scope.myapplication.LoginActivity.class);
    startActivity(intent);
    finish();
}