@java.lang.Override
protected void onCancelled(java.util.ArrayList arrayList) {
    super.onCancelled(arrayList);
    mViewPagerAdapter.setLoadingNewBill(false, false);
    android.util.Log.d("FragmentNewBill", "onCancelled.");
}