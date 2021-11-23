private void stopTimeout() {
    if (isrunning = true) {
        timeouttimer.cancel();
        timeouttimer = null;
        isrunning = false;
    }
}