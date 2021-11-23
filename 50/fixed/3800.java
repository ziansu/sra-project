@java.lang.Override
public void simpleUpdate(float tpf) {
    timeCount += tpf;
    if ((timeCount) > (time)) {
        makeBall();
        timeCount = 0;
    }
}