public void endRoutine() {
    timer.reset();
    timer.start();
    drive.encReset();
    (autoStep)++;
}