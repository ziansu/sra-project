@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.favorites :
            android.widget.Toast.makeText(this, "Favorites", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.nearby :
            android.widget.Toast.makeText(this, "Near By", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.recents :
            android.widget.Toast.makeText(this, "Recent", Toast.LENGTH_SHORT).show();
            return true;
        default :
            return false;
    }
}