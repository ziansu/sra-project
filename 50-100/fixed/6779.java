@java.lang.Override
public void onClick(android.view.View v) {
    mSectionsPagerAdapter.notifyDataSetChanged();
    mViewPager.setAdapter(mSectionsPagerAdapter);
    tabLayout.setupWithViewPager(mViewPager);
    mViewPager.setCurrentItem(0, true);
    prefEditor.putInt(getString(R.string.living_room_mode), selection[0]);
    prefEditor.apply();
    dialog.hide();
}