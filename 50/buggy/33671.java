@java.lang.Override
public void onClick(android.view.View view, int position) {
    mDrawerLayout.closeDrawer(GravityCompat.START);
    ((materialtest.sanjose.venkata.activities.MovieTabActivity) (getActivity())).onDrawerItemClicked(position);
}