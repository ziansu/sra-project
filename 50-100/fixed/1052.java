private void switchToShowMapFragment() {
    final java.lang.String switchToFragmentResult = net.videgro.ships.fragments.internal.FragmentUtils.switchToFragment(getActivity(), new net.videgro.ships.fragments.ShowMapFragment());
    if (!(switchToFragmentResult.isEmpty())) {
        net.videgro.ships.Analytics.logEvent(getActivity(), net.videgro.ships.fragments.CalibrateFragment.TAG, "switchToShowMapFragment - Error", switchToFragmentResult);
        net.videgro.ships.fragments.internal.FragmentUtils.stopApplication(this);
    }
}