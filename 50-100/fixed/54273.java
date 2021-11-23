public void countdownTick() {
    if ((countdown) <= 0) {
        countdownTask.cancel();
        countdownTask = null;
        start();
    }else {
        broadcast((((com.yahoo.tracebachi.FloorIsLava.FloorArena.GOOD) + "Starting in ") + (countdown)), null);
        (countdown)--;
    }
}