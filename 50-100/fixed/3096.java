@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.widget.TextView initial = ((android.widget.TextView) (this.getActivity().findViewById(R.id.initial)));
    if (location == null) {
        initial.setText("0.0");
    }else {
        float nCurrentSpeed = location.getSpeed();
        initial.setText(((int) (nCurrentSpeed)));
    }
}