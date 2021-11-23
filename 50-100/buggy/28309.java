@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.navigation_home :
            android.content.Intent theintent = new android.content.Intent(this, com.groupc.officelocator.campus.class);
            startActivity(theintent);
            return true;
        case R.id.navigation_search :
            android.content.Intent theintent2 = new android.content.Intent(this, com.groupc.officelocator.masterSearchWithHeaders.class);
            startActivity(theintent2);
            return true;
        case R.id.navigation_favorites :
            android.content.Intent theintent3 = new android.content.Intent(this, com.groupc.officelocator.favoritesList.class);
            startActivity(theintent3);
            return true;
    }
    return false;
}