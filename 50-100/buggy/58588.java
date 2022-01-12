@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d(com.jonathan.james.eric.project_3.SectionPageAdapterActivity.TAG, "onResume: Creating the manager and Fragments");
    mManager.beginTransaction().add(R.id.main_content_container, com.jonathan.james.eric.project_3.SectionViewPagerFragment.getInstance(mManager, this, this, this, this), "ViewPager").commit();
}