private void switchToShowMapFragment() {
    final java.lang.String switchToFragmentResult = net.videgro.ships.fragments.internal.FragmentUtils.switchToFragment(getActivity(), net.videgro.ships.fragments.ShowMapFragment.newInstance());
    if (!(switchToFragmentResult.isEmpty())) {
        net.videgro.ships.Analytics.logEvent(getActivity(), net.videgro.ships.fragments.CalibrateFragment.TAG, "switchToShowMapFragment - Error", switchToFragmentResult);
        net.videgro.ships.fragments.internal.FragmentUtils.stopApplication(this);
    }
}