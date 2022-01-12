private void startUserProfileFragment(samurai.geeft.android.geeft.models.User user, boolean isCurrentUser, boolean allowComunication) {
    android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
    transaction.addToBackStack(null);
    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = samurai.geeft.android.geeft.fragments.UserProfileFragment.newInstance(user, isCurrentUser, allowComunication, false);
    transaction.replace(R.id.fragment_container, fragment);
    transaction.commit();
}