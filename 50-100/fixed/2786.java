private void removeAllFragments(android.support.v4.app.FragmentManager fragmentManager) {
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    java.util.List<android.support.v4.app.Fragment> fragments = fragmentManager.getFragments();
    if (org.apache.commons.collections4.CollectionUtils.isNotEmpty(fragments)) {
        for (android.support.v4.app.Fragment fragment : fragments) {
            if (fragment != null) {
                android.util.Log.i(com.adguard.android.contentblocker.onboarding.OnboardingActivity.TAG, ("Removing fragment " + (fragment.toString())));
                transaction.remove(fragment);
            }
        }
    }
    transaction.commit();
}