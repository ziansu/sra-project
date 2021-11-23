public void boxClicked(android.view.View view) {
    if (mCheckBox.isChecked()) {
        com.elena.latencymeter.MainActivity.clockWise = false;
    }else {
        com.elena.latencymeter.MainActivity.clockWise = true;
    }
    android.util.Log.d(com.elena.latencymeter.MainActivity.TAG, ("direction clockWise: " + (com.elena.latencymeter.MainActivity.clockWise)));
    AnimationView.count = 0;
    AnimationView.distance = 0;
    myView.invalidate();
}