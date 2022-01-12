@java.lang.Override
public void requestedStartTrip(com.pertamina.tbbm.rewulu.ecodriving.pojos.Tripdata trip) {
    if (onPause) {
        return ;
    }else {
        mainTrackingFragment = new com.pertamina.tbbm.rewulu.ecodriving.fragment.MainTrackingFragment();
        mainTrackingFragment.setData(trip);
        getFragmentManager().beginTransaction().replace(R.id.container, mainTrackingFragment).commit();
    }
}