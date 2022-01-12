private void selectItem(int position) {
    if (position == (OPTION_MENU_ADD_PERSON)) {
        android.content.Intent intent = new android.content.Intent(this, com.six.maitime.ui.flipper.ViewFlipperMainActivity.class);
        startActivity(intent);
        return ;
    }else {
        replaceFragment(new com.six.maitime.ui.PersonListFragment());
        drawerList.setItemChecked(position, true);
        setTitle(optionsMenuTitles[position]);
        mDrawerLayout.closeDrawer(drawerList);
    }
}