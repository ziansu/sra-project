private void updateSavedCard(java.util.ArrayList<com.midtrans.sdk.corekit.models.SaveCardRequest> saveCardRequests) {
    java.util.List<android.support.v4.app.Fragment> fragments = getSupportFragmentManager().getFragments();
    for (android.support.v4.app.Fragment fragment : fragments) {
        if (fragment instanceof com.midtrans.sdk.uikit.fragments.SavedCardListFragment) {
            com.midtrans.sdk.uikit.fragments.SavedCardListFragment savedCardListFragment = ((com.midtrans.sdk.uikit.fragments.SavedCardListFragment) (fragment));
            savedCardListFragment.updateSavedCardsData(saveCardRequests, true);
        }
    }
}