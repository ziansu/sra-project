@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    android.content.Intent theintent = null;
    switch (item.getItemId()) {
        case R.id.navigation_home :
            theintent = new android.content.Intent(this, com.groupc.officelocator.campus.class);
            break;
        case R.id.navigation_search :
            theintent = new android.content.Intent(this, com.groupc.officelocator.masterSearchWithHeaders.class);
            break;
        case R.id.navigation_favorites :
            theintent = new android.content.Intent(this, com.groupc.officelocator.favoritesList.class);
            break;
    }
    startActivity(theintent);
    return true;
}