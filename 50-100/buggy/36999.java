@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    android.widget.TextView textView = ((android.widget.TextView) (getView().findViewById(R.id.text_view_gps_error)));
    if (textView != null) {
        textView.setText(((java.lang.String.valueOf(loc.getAccuracy())) + " m"));
    }
}