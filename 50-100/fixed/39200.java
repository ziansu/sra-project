@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add_marker :
            android.content.Intent addActivityIntent = new android.content.Intent(this, nl.hees.pokemapper.activity.AddActivity.class);
            startActivity(addActivityIntent);
            break;
        case R.id.action_logout :
            nl.hees.pokemapper.model.PokeMapperModel.getInstance().setCurrentUser(null);
            android.content.Intent loginActivityIntent = new android.content.Intent(this, nl.hees.pokemapper.activity.LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
            break;
    }
    return super.onOptionsItemSelected(item);
}