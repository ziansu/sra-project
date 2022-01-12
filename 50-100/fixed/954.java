@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.menu_home)) {
    }else
        if (id == (R.id.menu_course)) {
        }else
            if (id == (R.id.menu_profile)) {
                startActivity(new android.content.Intent(this, com.example.timotiusek.musikonekteacher.ProfileActivity.class));
            }else
                if (id == (R.id.menu_skill)) {
                }else
                    if (id == (R.id.menu_quit)) {
                        java.lang.System.exit(0);
                    }
                
            
        
    
    drawer.closeDrawer(GravityCompat.START);
    return true;
}