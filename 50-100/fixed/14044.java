@java.lang.Override
public void run() {
    if ((mJourneyActivity) == null)
        return ;
    
    if ((mCountOfSimulation) == (mCountOfSimulationPositionInBoardingPoints)) {
        mJourneyActivity.advanceNextOnBoardPoint();
        mCountOfSimulation = 0;
    }
    (mCountOfSimulation)++;
    if (contiune) {
        com.google.android.gms.maps.model.LatLng simulatedLatLng = getSimulationPosition(mCountOfSimulation);
        mJourneyActivity.onBusPositionChanged(simulatedLatLng);
        handler.postDelayed(this, mBusPositionSimulationInterval);
    }
}