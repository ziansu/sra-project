@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.top_menu_export :
            if (requestPermission())
                new com.kamontat.checkidnumber.api.getter.Export(presenter).show();
            
            break;
        case R.id.top_menu_about :
            new com.kamontat.checkidnumber.api.getter.About(this).show();
            break;
    }
    return super.onOptionsItemSelected(item);
}