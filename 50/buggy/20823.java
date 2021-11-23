@java.lang.Override
public void run() {
    if ((roll) != (-300)) {
        mapView.invalidate();
        mapDrawable.setPointArray(global_points);
        mapDrawable.setDegreeRotation(((int) (roll)));
    }
}