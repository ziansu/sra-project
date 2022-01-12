public void changeUnselectedIconInTabLayout(int position) {
    switch (position) {
        case 0 :
            tabLayout.getTabAt(0).setIcon(R.mipmap.home);
            break;
        case 1 :
            tabLayout.getTabAt(1).setIcon(R.mipmap.share);
            break;
        case 2 :
            tabLayout.getTabAt(2).setIcon(R.mipmap.profile);
            break;
        case 3 :
            tabLayout.getTabAt(3).setIcon(R.mipmap.setting);
            break;
    }
}