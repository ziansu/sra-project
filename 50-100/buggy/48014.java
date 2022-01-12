@java.lang.SuppressWarnings(value = "StatementWithEmptyBody")
@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.nav_today)) {
        android.content.Intent intent = new android.content.Intent(this, hu.tomkom.deliveryapp.ui.main.MainActivity.class);
        startActivity(intent);
    }else
        if (id == (R.id.nav_deliveries)) {
            android.content.Intent intent = new android.content.Intent(this, hu.tomkom.deliveryapp.ui.delivery.DeliveryActivity.class);
            startActivity(intent);
        }
    
    drawer.closeDrawer(GravityCompat.START);
    return true;
}