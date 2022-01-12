void refreshSchedule(int subgroup) {
    ru.bsuirhelper.android.ui.SchedulePagerAdapter adapter = new ru.bsuirhelper.android.ui.SchedulePagerAdapter(getSupportFragmentManager(), mGroupId, 1);
    int position = mPager.getCurrentItem();
    mPager.setAdapter(new ru.bsuirhelper.android.ui.SchedulePagerAdapter(getSupportFragmentManager(), mGroupId, subgroup));
    mPager.setAdapter(adapter);
    mPager.setCurrentItem(position);
}