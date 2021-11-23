public void close() {
    android.view.View drawer = robo.activity.findViewById(R.id.navigation_drawer);
    android.support.v4.widget.DrawerLayout view = ((android.support.v4.widget.DrawerLayout) (robo.activity.findViewById(R.id.drawer_layout)));
    view.closeDrawer(drawer);
    updateOpenCloseState();
    open();
}