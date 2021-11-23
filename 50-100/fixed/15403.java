private void sendDataToService() {
    android.content.Intent i = new android.content.Intent(getActivity().getBaseContext(), se.chalmers.datx02_15_36.studeraeffektivt.activity.MyCountDownTimer.class);
    i.putExtra("TIME_STUDY", default_StudyTime);
    i.putExtra("TIME_PAUSE", default_PauseTime);
    i.putExtra("TOTAL_TIME", default_TotalTime);
    getActivity().bindService(i, sc, Context.BIND_AUTO_CREATE);
    getActivity().startService(i);
}