@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    intent = new android.content.Intent(this, com.app.scope.myapplication.MainActivity.class);
    startActivity(intent);
    finish();
    return ;
}