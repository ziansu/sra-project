@java.lang.Override
public void onClick(android.view.View v) {
    if (mDrawerLayout.isDrawerOpen(((android.view.Gravity.START) | (android.view.Gravity.LEFT)))) {
        mDrawerLayout.closeDrawers();
    }
    android.widget.Toast.makeText(v.getContext(), "Itemclick + Drawer close", Toast.LENGTH_SHORT).show();
    mViewPager.getAdapter().notifyDataSetChanged();
}