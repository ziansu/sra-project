@java.lang.Override
public void onFinishDialog(java.lang.String destination) {
    if (!(destination.equals(""))) {
        mButtonSetDestination.setText(destination);
    }
    com.mobilemakers.juansoler.appradar.Transitions.fadeIN(mButtonSetDestination, Constants.TRANSIION_DURATION_1K);
    if ((mButtonStart.getVisibility()) != (android.view.View.VISIBLE)) {
        com.mobilemakers.juansoler.appradar.Transitions.fadeIN(mButtonStart, Constants.TRANSIION_DURATION_1K);
    }
}