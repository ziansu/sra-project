@java.lang.Override
public int calculateDxToMakeVisible(android.view.View view, int snapPreference) {
    int nearestOffset;
    if ((mCurrentPosition) != 0) {
        nearestOffset = ((int) (-(getCenterRelativePositionOf(view))));
    }else {
        nearestOffset = ((int) (-(getStartRelativePositionOf(view))));
    }
    android.util.Log.i("Jared", ("nearest Offset: " + nearestOffset));
    return nearestOffset;
}