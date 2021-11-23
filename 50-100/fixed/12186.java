protected void selectItem(int position) {
    if ((mDrawerLayout) != null) {
        mDrawerLayout.closeDrawer(mFragmentContainerView);
    }
    com.jvanier.android.sendtocar.controllers.commands.Command handler = itemsList.get(position).handler;
    if (handler != null) {
        handler.perfrom(getActivity());
    }
}