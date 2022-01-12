private void startTimer() {
    timer = new java.util.Timer();
    timer.schedule(task, 0, 1000);
}