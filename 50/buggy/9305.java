@java.lang.Override
public void run() {
    (time)--;
    if ((time) == 0) {
        task.cancel();
        gameStart();
    }else {
        sendTimeToStart();
    }
}