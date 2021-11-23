@java.lang.Override
public boolean onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem drawerItem) {
    handleDrawer(position);
    return false;
}