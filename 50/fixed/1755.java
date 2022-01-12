@java.lang.Override
void deathProcess() {
    if ((timer) != null) {
        timer.cancel();
        timer = null;
    }
}