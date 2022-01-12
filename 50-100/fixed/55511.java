@java.lang.Override
public void run() {
    gps = g.getResult();
    if ((((gps.accuracy) > 0) && ((gps.accuracy) < 50)) && ((cntUp) < 10)) {
        (cntUp)++;
    }
    if ((cntUp) == 20) {
        broadcastStop();
    }
    broadcastMsg(GetFormatInfo(gps), true);
}