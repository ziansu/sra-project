public java.lang.Class<? extends android.support.v4.app.Fragment> getClassFromId(int itemId) {
    java.lang.Class<? extends android.support.v4.app.Fragment> fragmentClass;
    switch (itemId) {
        case R.id.nav_browse :
            fragmentClass = com.pledgeapp.pledge.fragments.BrowseFragment.class;
            break;
        case R.id.nav_donation_history :
            fragmentClass = com.pledgeapp.pledge.fragments.DonationHistoryFragment.class;
            break;
        case R.id.nav_payment_method :
            fragmentClass = com.pledgeapp.pledge.fragments.AddPaymentFragment.class;
            break;
        case R.id.nav_link_employer :
            fragmentClass = com.pledgeapp.pledge.fragments.LinkEmployerFragment.class;
            break;
        case R.id.nav_account_settings :
            fragmentClass = com.pledgeapp.pledge.fragments.AccountSettingsFragment.class;
            break;
        default :
            throw new java.lang.RuntimeException("Unknown menu item");
    }
    return fragmentClass;
}