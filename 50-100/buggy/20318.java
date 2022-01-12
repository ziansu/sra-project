private void refreshActionBar() {
    if ((mActionBar) != null) {
        mActionBar.setSubtitle(((getString(R.string.subtitleOrderedPrefix)) + (mOrderType.equals("popularity") ? getString(R.string.subtitleRating) : getString(R.string.subtitlePopularity))));
        mActionBar.invalidateOptionsMenu();
    }
}