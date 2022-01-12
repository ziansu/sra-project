@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add :
            listener.onAddPokemonClick();
            return true;
        default :
            return false;
    }
}