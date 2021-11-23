@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
        case R.id.action_save :
            com.github.idclark.forgetmenot.EditFragment editFragment = ((com.github.idclark.forgetmenot.EditFragment) (getSupportFragmentManager().findFragmentById(R.id.edit_fragment)));
            createOrUpdateTask(editFragment);
            startActivity(new android.content.Intent(this, com.github.idclark.forgetmenot.MainActivity.class));
            return true;
        case R.id.action_delete :
            startActivity(new android.content.Intent(this, com.github.idclark.forgetmenot.MainActivity.class));
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}