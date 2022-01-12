public void closeSponsorDetails() {
    if (sponsorDetailOpen) {
        getActivity().getFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).remove(getFragmentManager().findFragmentById(R.id.drawer_layout)).commit();
    }
    sponsorDetailOpen = false;
}