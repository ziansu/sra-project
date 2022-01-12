@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }else
        if (id == (R.id.playlist_item)) {
            com.kaidoh.mayuukhvarshney.gearjam.PlayListFragment fragobj = new com.kaidoh.mayuukhvarshney.gearjam.PlayListFragment();
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.FragmentContainer, fragobj);
            ft.addToBackStack(null);
            ft.commit();
        }
    
    return super.onOptionsItemSelected(item);
}