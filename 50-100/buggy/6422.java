@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add_product :
            startActivity(new android.content.Intent(this, com.msr.firebasesamples.activities.AddDataActivity.class));
            break;
        case R.id.reset_password :
            startActivity(new android.content.Intent(this, com.msr.firebasesamples.activities.ResetPasswordActivity.class));
            break;
        case R.id.logout :
            auth.signOut();
            break;
    }
    return true;
}