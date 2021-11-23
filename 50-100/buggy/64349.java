@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    super.onOptionsItemSelected(item);
    if ((item.getItemId()) == (R.id.main_logout_btn)) {
        com.google.firebase.auth.FirebaseAuth.getInstance().signOut();
        android.content.Intent startIntent = new android.content.Intent(this, com.mobiversal.practica.biaflatalking.StartActivity.class);
        startActivity(startIntent);
        finish();
    }
    return true;
}