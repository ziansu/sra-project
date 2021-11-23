private void selectItem(int position) {
    switch (position) {
        case 0 :
            {
                android.content.Intent intent = new android.content.Intent(activity, com.columbasms.columbasms.activity.UserProfileActivity.class);
                startActivity(intent);
                break;
            }
        default :
            break;
    }
    mDrawerLayout.closeDrawer(mDrawerList);
}