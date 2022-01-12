@java.lang.Override
public void onBackPressed() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        android.content.Intent myIntent = new android.content.Intent(this, tk.lefourretoutsonore.lefourre_toutsonore.Main.class);
        myIntent.putExtra("user", currentUser);
        this.startActivity(myIntent);
    }
}