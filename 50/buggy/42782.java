@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
    drawerLayout.closeDrawer(Gravity.LEFT);
}