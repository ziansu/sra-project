@java.lang.Override
public boolean onItemClick(android.view.View view, int position, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem drawerItem) {
    android.content.Intent intent = new android.content.Intent(activity, com.dreamsofpines.mcunost.ui.activities.CategoriesActivity.class);
    activity.startActivity(intent);
    return false;
}