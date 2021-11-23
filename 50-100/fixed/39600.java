@java.lang.Override
public void switchContent(android.support.v4.app.Fragment fragment, java.lang.Boolean addToBackstack) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction ft = manager.beginTransaction();
    ft.replace(R.id.content_layout, fragment);
    if (addToBackstack) {
        ft.addToBackStack(null);
    }
    ft.commit();
}