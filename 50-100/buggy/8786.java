private void setupTabLayout() {
    tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    tabLayout.addTab(tabLayout.newTab().setText(com.nsqre.insquare.Fragments.ProfileFragment.TAB_OWNED));
    tabLayout.addTab(tabLayout.newTab().setText(com.nsqre.insquare.Fragments.ProfileFragment.TAB_FAVOURITE));
    tabLayout.setOnTabSelectedListener(this);
    if (!(InSquareProfile.ownedSquaresList.isEmpty())) {
        squaresList.setAdapter(adapterOwned);
        emptyText.setVisibility(View.INVISIBLE);
    }else {
        emptyText.setVisibility(View.VISIBLE);
        emptyText.setText(getString(R.string.profile_empty_owned));
    }
}