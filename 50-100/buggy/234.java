@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof com.crabfibber.fragments.RushPlaceHolderFragment.OnFragmentInteractionListener) {
        mListener = ((com.crabfibber.fragments.RushPlaceHolderFragment.OnFragmentInteractionListener) (context));
    }else {
        throw new java.lang.RuntimeException(((context.toString()) + " must implement OnFragmentInteractionListener"));
    }
    sensorManager = ((android.hardware.SensorManager) (getActivity().getSystemService(Context.SENSOR_SERVICE)));
    mAccelorometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    buffer = new java.lang.StringBuffer();
}