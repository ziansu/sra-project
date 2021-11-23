public void goToLoginFragment() {
    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new org.naturenet.ui.LoginFragment(), LoginFragment.FRAGMENT_TAG).addToBackStack(null).commit();
}