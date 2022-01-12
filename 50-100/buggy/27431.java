@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.top_menu_export :
            int re = requestPermission();
            if (re == 0)
                new com.kamontat.checkidnumber.api.getter.Export(presenter).show();
            else
                if (re == 2)
                    new com.kamontat.checkidnumber.api.getter.NonExport(this).show();
                
            
            break;
        case R.id.top_menu_about :
            new com.kamontat.checkidnumber.api.getter.About(this).show();
            break;
    }
    return super.onOptionsItemSelected(item);
}