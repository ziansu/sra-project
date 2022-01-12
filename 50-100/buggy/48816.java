private void refreshPlaygroundList(java.util.List<? extends com.playground.notification.ds.grounds.Playground> list) {
    if ((mPlaygroundListFragment) == null) {
        mBinding.playGroundsListContainer.setVisibility(View.VISIBLE);
        mPlaygroundListFragment = ((com.playground.notification.app.fragments.PlaygroundListFragment) (getSupportFragmentManager().findFragmentById(R.id.play_grounds_list)));
        mMap.setOnCameraMoveStartedListener(mPlaygroundListFragment);
    }
    mPlaygroundListFragment.refresh(list);
}