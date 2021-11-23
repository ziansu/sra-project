public void endRoutine() {
    timer.stop();
    timer.reset();
    timer.start();
    drive.encReset();
    (autoStep)++;
}