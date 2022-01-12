@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.generator_contextmenu_setindex :
            onSetIndex(null);
            return true;
        case R.id.generator_contextmenu_setpin :
            onSetPin();
            return true;
        case R.id.generator_contextmenu_showcode :
            onShowCode();
            return true;
    }
    return super.onOptionsItemSelected(item);
}