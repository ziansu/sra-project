private void selectItem(int position) {
    android.app.Fragment fragment = new com.fortech.aiteam.aiteam.NavDrawerActivity.PlanetFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.fortech.aiteam.aiteam.NavDrawerActivity.PlanetFragment.ARG_PLANET_NUMBER, position);
    fragment.setArguments(args);
    android.app.FragmentManager fragmentManager = getFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
    mDrawerList.setItemChecked(position, true);
    mDrawerLayout.closeDrawer(mDrawerList);
}