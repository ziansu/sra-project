@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    if ((com.example.koba.reklappclient.AppActivity.currentFragmentId) != position) {
        com.example.koba.reklappclient.AppActivity.currentFragmentId = position;
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = getFragmentById(position);
        if (fragment != null) {
            manager.beginTransaction().replace(R.id.flContent, fragment).addToBackStack(null).commit();
            drawer.closeDrawer(Gravity.LEFT);
        }
    }
}