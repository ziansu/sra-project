@java.lang.Override
public void run() {
    if ((mJourneyActivity) == null)
        return ;
    
    if ((mCountOfSimulation) == (mCountOfSimulationPositionInBoardingPoints)) {
        mJourneyActivity.advanceNextOnBoardPoint();
        mCountOfSimulation = 0;
    }
    (mCountOfSimulation)++;
    com.google.android.gms.maps.model.LatLng simulatedLatLng = getSimulationPosition(mCountOfSimulation);
    mJourneyActivity.onBusPositionChanged(simulatedLatLng);
    if (contiune)
        handler.postDelayed(this, mBusPositionSimulationInterval);
    
}