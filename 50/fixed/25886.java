public void replaceRootFragment(com.dmcapps.navigationfragment.fragments.INavigationFragment navFragment) {
    clearNavigationStackToPosition(((getMinStackSize()) - 1), false);
    pushFragment(navFragment, com.dmcapps.navigationfragment.manager.NavigationManagerFragment.NO_ANIMATION, com.dmcapps.navigationfragment.manager.NavigationManagerFragment.NO_ANIMATION);
}