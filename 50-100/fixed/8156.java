@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.navigation_home :
            return true;
        case R.id.navigation_dashboard :
            intent = new android.content.Intent(this, com.example.sky.environment.TinTuc.class);
            startActivity(intent);
            return true;
        case R.id.menu :
            intent = new android.content.Intent(this, com.example.sky.environment.Future.class);
            startActivity(intent);
            return true;
    }
    return false;
}