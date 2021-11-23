private void putHomeFragmentInTop(boolean back) {
    headertextview.setText(getResources().getString(R.string.principaltext).toUpperCase());
    selectFragment(com.udl.android.bloodpressuremonitor.fragments.HomeFragment.getNewInstace(), true, back);
}