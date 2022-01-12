private void refreshActionBar() {
    if ((mActionBar) != null) {
        mActionBar.setSubtitle(((getString(R.string.subtitleOrderedPrefix)) + (mOrderType.equals("popularity") ? getString(R.string.subtitlePopularity) : getString(R.string.subtitleRating))));
        mActionBar.invalidateOptionsMenu();
    }
}