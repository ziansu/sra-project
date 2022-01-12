public void backNavigation() {
    boolean popped = getSupportFragmentManager().popBackStackImmediate();
    if (popped) {
        com.swerly.wifiheatmap.FragmentBase curFrag = ((com.swerly.wifiheatmap.FragmentBase) (fragmentManager.findFragmentById(R.id.fragment_container)));
        fabHelper.setupFab(curFrag, true);
    }else {
        finish();
    }
}