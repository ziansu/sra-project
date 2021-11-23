@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.generator_contextmenu_setindex :
            onSetIndex(null);
            break;
        case R.id.generator_contextmenu_setpin :
            onSetPin();
            break;
        case R.id.generator_contextmenu_showcode :
            onShowCode();
            break;
    }
    return super.onOptionsItemSelected(item);
}