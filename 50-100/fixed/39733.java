protected void openActivity(int position) {
    mDrawerLayout.closeDrawer(mDrawerList);
    com.grupp3.projekt_it.BaseActivity.position = position;
    switch (position) {
        case 0 :
            startActivity(new android.content.Intent(this, com.grupp3.projekt_it.MainActivity.class));
            break;
        case 1 :
            startActivity(new android.content.Intent(this, com.grupp3.projekt_it.MyGardenListActivity.class));
            break;
        case 2 :
            break;
        case 3 :
            break;
        default :
            break;
    }
}