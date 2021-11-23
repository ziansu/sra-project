@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_create)) {
        startActivity(new android.content.Intent(this, com.example.umesh.teachforindia.CreateOpportunity.class));
    }else
        if ((item.getItemId()) == (R.id.action_logout)) {
            mAuth.signOut();
            finish();
            startActivity(new android.content.Intent(this, com.example.umesh.teachforindia.LoginActivity.class));
        }
    
    return super.onOptionsItemSelected(item);
}