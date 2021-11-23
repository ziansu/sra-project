public void onClick(android.content.DialogInterface dialog, int whichButton) {
    isStartedExerise = false;
    TextViewStage.setText(R.string.coolingDown);
    resetChronometer();
    myChronometer.setOnChronometerTickListener(new my.com.taruc.fitnesscompanion.VirtualRacer.VirtualRacerMainActivity.TickListener(0, 5));
    startTimer();
    ViewStart.setText(R.string.end);
    total_dis = 0;
    addVRRecord();
}