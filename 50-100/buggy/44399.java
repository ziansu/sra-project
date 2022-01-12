private void stopTimer() {
    if (org.oucho.radio2.MainActivity.running)
        org.oucho.radio2.MainActivity.mTask.cancel(true);
    
    timerEcran.cancel();
    org.oucho.radio2.MainActivity.running = false;
    org.oucho.radio2.utils.Notification.setState(false);
    org.oucho.radio2.utils.State.getState(org.oucho.radio2.MainActivity.context);
    timeAfficheur0 = ((android.widget.ImageView) (findViewById(R.id.icon_time)));
    timeAfficheur1 = ((android.widget.TextView) (findViewById(R.id.time_ecran)));
    timeAfficheur0.setVisibility(View.INVISIBLE);
    timeAfficheur1.setVisibility(View.INVISIBLE);
}