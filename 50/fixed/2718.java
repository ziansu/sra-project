@java.lang.Override
public void onClick(android.view.View v) {
    showOrtophoto = !(showOrtophoto);
    orthophotoOverlay.setEnabled(showOrtophoto);
    mapView.invalidate();
}