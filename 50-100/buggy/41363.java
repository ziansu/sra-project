@java.lang.Override
public boolean onItemClick(android.view.View view, int position, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem drawerItem) {
    android.util.Log.d("drawer", ((("The drawer is: " + drawerItem) + " position is ") + position));
    if (position == 1) {
        startMainActivity();
        android.util.Log.d("drawer", "Started about activity");
    }else
        if (position == 3) {
            startSettingsActivity();
            android.util.Log.d("drawer", "Started about activity");
        }
    
    return false;
}