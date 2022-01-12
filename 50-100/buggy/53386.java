@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        com.rflpazini.fpsj.MainActivity.startAlert(getApplicationContext(), getString(R.string.about_app), getString(R.string.action_about));
        return true;
    }
    return super.onOptionsItemSelected(item);
}