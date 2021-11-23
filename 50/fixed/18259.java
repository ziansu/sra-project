public void spinWheel(android.view.View v) {
    v.setEnabled(false);
    dialer.setEnabled(false);
    dialer.post(new com.concon.talkabout.talkabout.SpinWheelGameplay.FlingRunnable(random.nextInt(1500), v));
}